class Phone{
    public void call(){System.out.println("Phone call");};
    public void sms(){System.out.println("Phone SMS");};
}

interface ICamera{
    void click();
    void record();
}

interface IMusicPlayer{
    void play();
    void pause();
}

class SmartPhone extends Phone implements ICamera, IMusicPlayer
{
    public void videoCall(){System.out.println("SmartPhone video calling");}
    @Override
    public void click(){System.out.println("The picture has been clicked");}
    @Override
    public void record(){System.out.println("The video has been recorded");}
    @Override
    public void play(){System.out.println("Smart Phone Playing music");}
    @Override
    public void pause(){System.out.println("Smart phone paused music");}
}

class InterfaceExample{
    public static void main(String args[]){
        SmartPhone smart =new SmartPhone();
        smart.click();
        smart.call();
        smart.play();
        ICamera sp = new SmartPhone();  //Here Dynamic method dispatch or polymorphism is happening
        sp.click();
        sp.record();
        
    
    }
}