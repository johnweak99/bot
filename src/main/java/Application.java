public class Application {

    public static void main(String[] args)throws Exception{
        Runtime rt = Runtime.getRuntime();
        String url = "https://www.nike.com/my/member/profile/login";
        //rt.exec("rundll32 url.dll,FileProtocolHandler " + url);
        rt.exec(new String[]{"cmd","/c","start chrome --new-window "+url});
        //Runtime.getRuntime().exec(new String[]{"cmd", "/c","start chrome http://google.com"});
    }

}
