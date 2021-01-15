/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.PenyewaController;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author sugi
 */
public class MobilGUI {
    
    JFrame LogReg = new JFrame();
    JTable tabelpraktikan = new JTable();
    JTextArea area = new JTextArea();
    JLabel merkmobil,namamobil,nopol,hrgsewa,lamasewa,top,bayar;
    JTextField textmerk,textnama,textnopol,textharga,textsewa,textbayar;
    JButton insert;
    
    public MobilGUI(){
        LogReg.setSize(700, 630);
        LogReg.setLayout(null);
        LogReg.getContentPane().setBackground(Color.GRAY);
        top = new JLabel("Rental Mobil");
        top.setBounds(200,10,600,50);
        top.setFont(new Font("Times New Roman",Font.BOLD,30));
        LogReg.add(top);
        
        area.setBounds ( 270, 180, 400, 210);
        LogReg.add(area);
        
        merkmobil = new JLabel("Merk Mobil");
        merkmobil.setBounds(50,150,100,30);
        LogReg.add(merkmobil);
        
        textmerk = new JTextField();
        textmerk.setBounds(50,180,200,30);
        LogReg.add(textmerk);
        
        namamobil = new JLabel("Nama Mobil");
        namamobil.setBounds(50,210,100,30);
        LogReg.add(namamobil);
        
        textnama = new JTextField();
        textnama.setBounds(50,240,200,30);
        LogReg.add(textnama);
        
        nopol = new JLabel("No Polisi");
        nopol.setBounds(50,270,100,30);
        LogReg.add(nopol);
        
        textnopol = new JTextField();
        textnopol.setBounds(50,300,200,30);
        LogReg.add(textnopol);
        
        hrgsewa = new JLabel("Harga Sewa");
        hrgsewa.setBounds(50,330,200,30);
        LogReg.add(hrgsewa);
        
        textharga = new JTextField();
        textharga.setBounds(50,360,200,30);
        LogReg.add(textharga);
        
        lamasewa = new JLabel("Lama Sewa");
        lamasewa.setBounds(50,390,200,30);
        LogReg.add(lamasewa);
        
        textsewa = new JTextField();
        textsewa.setBounds(50,420,200,30);
        LogReg.add(textsewa);
        
        bayar = new JLabel("Bayar");
        bayar.setBounds(50,450,200,30);
        LogReg.add(bayar);
        
        textbayar = new JTextField();
        textbayar.setBounds(50,480,200,30);
        LogReg.add(textbayar);
        
        insert = new JButton("Insert");
        insert.setBounds(50, 520, 100, 30);
        insert.setBackground(Color.GREEN);
        LogReg.add(insert);
        LogReg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LogReg.setVisible(true);
        LogReg.setLocationRelativeTo(null);
        insert.addActionListener(new ActionListener()
        {
            
            public void actionPerformed(ActionEvent ae){
              try{
                String merk = textmerk.getText();
                String nama = textnama.getText();
                String nopol = textnopol.getText();
                int bayar = Integer.parseInt(textbayar.getText());
                int hrg = Integer.parseInt(textharga.getText());
                int kembali = bayar-hrg;
                allobjctrl.mobil.insertMobil(merk, nama, nopol, hrg);
                allobjctrl.mobil.mobilEntity().setByr(bayar);
                allobjctrl.mobil.mobilEntity().setKembali(kembali);
                JOptionPane.showMessageDialog(null,"Input Sukses", "information", JOptionPane. INFORMATION_MESSAGE);
                area.setText(datamobil());
            
            }catch(Exception exception){
                JOptionPane.showMessageDialog(null,"Format Penulisan Salah", "Input Gagal",JOptionPane. INFORMATION_MESSAGE);
            }
            }
        });
    }
    String datamobil(){
        String text = 
        "=========MOBIL========="+"\n\n"
        + "Merk       = "+allobjctrl.mobil.mobilEntity().getMerk()+"\n"
        + "Nama Mobil = "+allobjctrl.mobil.mobilEntity().getNamaMB()+"\n"
        + "No.Polisi  = "+allobjctrl.mobil.mobilEntity().getNopol()+"\n"
//        + "Harga      = Rp. "+allobjctrl.mobil.mobilEntity().getHrg()+"\n"
        + "Harga      = Rp. "+allobjctrl.mobil.mobilEntity().getHrg()+"\n"
        + "Bayar      = Rp. "+allobjctrl.mobil.mobilEntity().getByr()+"\n"
        + "====================="+"\n"
        + "Kembalian  = Rp. "+allobjctrl.mobil.mobilEntity().getKembali();
    return text;
    }
    public static void main(String[] args) {
        MobilGUI gui = new MobilGUI();
    } 
}
