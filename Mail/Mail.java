package Mail;

//必要な部分を読み込むところ
import jakarta.mail.*;
import jakarta.mail.internet.*;
import java.util.Properties;
import javax.swing.*;
import java.awt.*;

public class Mail extends JFrame{
    private JTextField tfHost, tfPort, tfUser, tfTo, tfSubject, tfFrom, tfName;
    private JPasswordField pfPass;
    private JTextArea taBody;
    private JButton btnSend;

    //コンストラクタを作る
    public Mail(){
        super("メール送信専用アプリ");
        //　＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝
        //ロリポップの設定
        //　＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝
        final String username = "info@hikaru.cutegirl.jp"; //ロリポップのメールアドレスのアカウント
        final String password = "-1-J0nbV-ArY4Lh_"; //そのパスワード

        //　＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝
        //メールの内容
        //　＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝
        final String toEmail = "2410027@i-seifu.jp"; //送信先のメールアドレス
        final String fromEmail = "2410027@i-seifu.jp"; //送信者のメールアドレス
        final String fromName = "";//送信者名
        final String subject = "";//タイトル(件名)
        final String body = """
                    
                            """; //本文
        //フレームの初期設定
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        setLocationRelativeTo(null);

        //レイアウト
        JPanel panel = new JPanel(new BorderLayout(10,10));
        JPanel top = new JPanel(new GridLayout(8,2,5,5));

        top.add(new JLabel("SMTPホスト"));
        tfHost = new JTextField("smtp.lolipop.jp");
        top.add(tfHost);

        top.add(new JLabel("ポート"));
        tfPort = new JTextField("465");
        top.add(tfPort);

        top.add(new JLabel("ユーザー名:"));
        tfUser = new JTextField(username);
        top.add(tfUser);

        top.add(new JLabel("パスワード:"));
        pfPass = new JPasswordField(password);
        top.add(pfPass);

        top.add(new JLabel("送信元のメールアドレス(偽装可能)"));
        tfFrom = new JTextField(fromEmail);
        top.add(tfFrom);

        top.add(new JLabel("送信元の名前(偽装可能)"));
        tfName = new JTextField(fromName);
        top.add(tfName);

        top.add(new JLabel("宛先(To):"));
        tfTo = new JTextField(toEmail);
        top.add(tfTo);

        top.add(new JLabel("件名:"));
        tfSubject = new JTextField(subject);
        top.add(tfSubject);


        panel.add(top,BorderLayout.NORTH);

        taBody = new JTextArea(body, 10, 40);
        JScrollPane scroll = new JScrollPane(taBody);
        panel.add(scroll, BorderLayout.CENTER);

        btnSend = new JButton("送信する");
        btnSend.addActionListener(e -> sendMail());
        panel.add(btnSend, BorderLayout.SOUTH);



        add(panel);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(
            () -> new Mail().setVisible(true)
        );
    }


    //メールを送信するメソッド(関数)
    public  void sendMail(){
        //メール送信サーバー(SMTP)の設定を作る
        //　＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝
        //メールの設定
        //　＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝
        Properties props = new Properties();
        props.put("mail.smtp.host",tfHost.getText());//SMTPサーバーのアドレス設定
        props.put("mail.smtp.port",tfPort.getText());//SMTPサーバーのポート設定
        props.put("mail.smtp.auth","true");//SMTPサーバーの認証設定
        props.put("mail.smtp.ssl.enable","true");//SMTPサーバーの認証設定
        props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
        //　＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝
        //メールの認証処理
        //　＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝
        //設定をつかってメール送信サーバー(smtp)にログインする
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(tfUser.getText(), new String(pfPass.getPassword()));
            }
        });
        //　＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝
        //メールの送信処理
        //　＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝
        try {
            //メール内容を作成
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(tfFrom.getText(),tfName.getText(),"Utf-8"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(tfTo.getText()));
            message.setSubject(tfSubject.getText());
            message.setText(taBody.getText());

            //メール内容を送信する
            Transport.send(message);
            System.out.println("メール送信成功");
        } catch (Exception e) {
            e.printStackTrace();
            
        }
    }
}
