/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB7.BAI1;

/**
 *
 * @author Ngoc Nhi
 */
    
public class MayBay extends PhuongTienDiChuyen{
        String loaiNhienLieu;

    public String getLoaiPhuongTien() {
        return loaiPhuongTien;
    }
        
        public double layVanToc(){
        System.out.println("lay van toc");
            return 0;
        } 
         void catCanh(){
        System.out.println("Cat canh");
                }
        void haCanh(){
        System.out.println("Ha canh");
                }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }
       
}

