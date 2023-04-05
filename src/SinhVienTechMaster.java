public abstract class SinhVienTechMaster {
    private String name;
    private String profession;
    public abstract double getDiem();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }



    public void getHocLuc(){
        if(getDiem()<5){
            System.out.println("Weak");
        }else if(5<=getDiem() && getDiem() <6.5){
            System.out.println("Average");
        }else if(6.5<=getDiem() &&getDiem() <7.5){
            System.out.println("Decent");
        }else if(7.5<=getDiem() &&getDiem() <=10){
            System.out.println("Good");
        }

    }
    public void display(){
        System.out.print(name+"  "+profession+"  "+getDiem()+"  ");
        getHocLuc();
    }

}
