package J0611;

import java.io.File;

public class Main {
    //　フォルダ（ファイル）削除するプログラム

    public static void main(String[] args) {
        //削除したいフォルダのパスを保存する変数
        String folderpath = "C:\\tmp";
        File folder = new File(folderpath);

        //フォルダが存在するか確認
        if(deleteFolder(folder)){
            System.out.println("フォルダを削除しました:" + folderpath);
        }else{
            System.out.println("フォルダを削除に失敗しました:" + folderpath);
        }

    }

    //再帰的にフォルダと中身を削除するメソッド
    public static boolean deleteFolder(File folder){
        //フォルダが存在しない場合はfalseを返す
        if(folder.exists() != true){
            return false;
        }

        //フォルダ内のファイルやサブフォルダをすべて削除する
        File[] files = folder.listFiles();
        if(files != null){
            //拡張for (PHPでいうforeach)
            for(File file:files){
                if(file.isDirectory()){
                    deleteFolder(file); //再帰呼び出し
                }else{
                    file.delete();
                }
            }
        }
        //最後にフォルダ自信を削除
        return folder.delete();
    }
}
