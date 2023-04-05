public class SinhVienIT extends SinhVienTechMaster{
    private double markJava,markHtml,markCss;

    public double getMarkJava() {
        return markJava;
    }

    public void setMarkJava(double markJava) {
        this.markJava = markJava;
    }

    public double getMarkHtml() {
        return markHtml;
    }

    public void setMarkHtml(double markHtml) {
        this.markHtml = markHtml;
    }

    public double getMarkCss() {
        return markCss;
    }

    public void setMarkCss(double markCss) {
        this.markCss = markCss;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getProfession() {
        return super.getProfession();
    }

    @Override
    public void setProfession(String profession) {
        super.setProfession(profession);
    }

    @Override
    public double getDiem() {
        return (2*markJava + markHtml + markCss)/4;

    }

    @Override
    public void getHocLuc() {
        super.getHocLuc();
    }

    @Override
    public void display() {
        super.display();
    }
}
