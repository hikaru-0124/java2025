package J0521;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

public class Weather {
    public static void main(String[] args) {
        //学校の緯度経度
        double lat = 33.562762240473425; //緯度,ffff
        double lng = 133.57296910859645;  //経度

        //APIを使うためのプログラム

        //アクセス先のURLを作る
        String apiUrl = String.format(
            "https://api.open-meteo.com/v1/forecast?latitude=%.4f&longitude=%.4f&current=temperature_2m,wind_speed_10m,is_day,weather_code&timezone=Asia/Tokyo",
            lat, lng
        );
        //System.out.println(apiUrl);

        //
        try {
            //APIリクエストを送る処理を作る
            //Javaの中でURLオブジェクトを作る
            URL url = new URL(apiUrl);
            //JavaのなかからHTTPアクセスをする
            //対象のURLに接続しに行く
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            //GETでアクセスする処理を実行
            conn.setRequestMethod("GET");

            //レスポンスデータを取得
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream())); //レスポンスデータ
            StringBuilder responseBuilder = new StringBuilder(); //最終的に画面に出したいデータがたまっていく変数
            String line; //readerから一行ずつでーたをとるための仮の変数

            while((line = reader.readLine()) != null){
                //responseBuilderに一行ずつデータを追加していく
                responseBuilder.append(line);
            }
            reader.close();
            //System.out.println(responseBuilder);

            //responseBUilderの文字列をJSONに変換
            JSONObject json = new JSONObject(responseBuilder.toString());
            //JSONデータの中から「current」データだけとる
            JSONObject current = json.getJSONObject("current");
            System.out.println(current.toString(4));

            //気温
            double temperature = current.getDouble("temperature_2m");
            //風速
            double windSpeed = current.getDouble("wind_speed_10m");
            //昼夜判定
            int isDay = current.getInt("is_day");
            String timeofDay = isDay == 1 ? "昼" : "夜";
            //天気コードを日本語に変換
            String weatherDes = translateWeatherCode(current.getInt("weather_code"));

            System.out.println("＝＝＝現在の天気＝＝＝");
            System.out.println("時間帯 :" + timeofDay);
            System.out.println("天気 : " + weatherDes);
            System.out.printf("気温 : %.1f°C%n" , temperature);
            System.out.printf("風速 : %.1fm/s%n" , windSpeed);

        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    // Open-Meteoのweather_codeを日本語に翻訳
    public static String translateWeatherCode(int code) {
        switch (code) {
            case 0:
                return "快晴";
            case 1:
            case 2:
            case 3:
                return "晴れ・曇り";
            case 45:
            case 48:
                return "霧";
            case 51:
            case 53:
            case 55:
                return "霧雨";
            case 61:
            case 63:
            case 65:
                return "雨";
            case 71:
            case 73:
            case 75:
                return "雪";
            case 95:
                return "雷雨";
            case 96:
            case 99:
                return "雷雨（ひょう）";
            default:
                return "不明な天気";
        }
    }
}
