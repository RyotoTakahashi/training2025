package java08;

class SmartPhone extends Phone{
    SmartPhone() {
        this.phone_number = "090-1111-1111";
        this.mail_address = "sample@a-force.co.jp";
    }
    int volume = 5;
    int trackNo = 1;
    void playmusic(){
        System.out.println(trackNo+"曲目を再生します");
    }

    void stopmusic(){
        System.out.println("音楽を止めます");
    }

    void nextmusic(){
        trackNo += 1;
        playmusic();
    }

    void prevmusic(){
        if (trackNo >1){
            trackNo -= 1;
        }
        playmusic();
    }

    void volumeup(int Volup){
        volume = Math.min(10,Volup+volume);
        System.out.println("volumeを"+Volup+"あげます");
        System.out.println("volumeは"+volume+"です。");
    }

    void volumedown(int Voldown){
        volume = Math.max(0,volume-Voldown);
        System.out.println("volumeを"+Voldown+"下げます");
        System.out.println("volumeは"+volume+"です。");
        }
    }