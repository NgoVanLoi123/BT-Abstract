public class SinhVienBiz extends SinhVienTechMaster{
    private double markSales,markMarketing;

    public double getMarkSales() {
        return markSales;
    }

    public void setMarkSales(double markSales) {
        this.markSales = markSales;
    }

    public double getMarkMarketing() {
        return markMarketing;
    }

    public void setMarkMarketing(double markMarketing) {
        this.markMarketing = markMarketing;
    }

    @Override
    public double getDiem() {
        return (2*markMarketing + markSales)/3;
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
