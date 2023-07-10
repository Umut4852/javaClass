public class avukat {  // constructor
    private String name;
    private String buroname;

    public avukat(String name,String buroname){
        this.name=name;
        this.buroname=buroname;
    }
    public void avukatInfo(){
        System.out.println("Avukat ismi: "+this.name);
        System.out.println("Avukatın bro ismi: "+this.buroname);
    }
    public avukat(){
       this.name="NotFount";
        this.buroname="NotFount";
        // this("NotFount","NotFount"); bu şekilde de kısaltma yapabilirim
    }
}
