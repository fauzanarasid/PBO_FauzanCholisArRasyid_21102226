package COM.FAUZANCHOLIS.PBO.Pertemuan7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class register extends JFrame{
    private JTextField txt_nama;
    private JTextField txt_nim;
    private JComboBox cb_prodi;
    private JTextField txt_telp;
    private JRadioButton rb_laki;
    private JRadioButton rb_perempuan;
    private JTextArea ta_alamat;
    private JButton saveButton;
    private JButton clearButton;
    private JPanel jpanel;
    private ButtonGroup JK;

    public register(){
        super ("form register");

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(jpanel);
        this.setSize(800, 600);
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            txt_nama.setText("");
            txt_nim.setText("");
            txt_telp.setText("");
            ta_alamat.setText("");
            cb_prodi.setSelectedIndex(0);
            JK.clearSelection();
            }
        });
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = txt_nama.getText();
                String nim = txt_nim.getText();
                String Telp = txt_telp.getText();
                String alamat = ta_alamat.getText();
                String prodi = cb_prodi.getSelectedItem().toString();
                String JK;
                if (rb_laki.isSelected()){
                    JK = "Laki-Laki";
                }else if (rb_perempuan.isSelected()){
                    JK = "Perempuan";
                }else {
                    JK = "Belum Dipilih";
                }
                if (nama.isEmpty() || nim.isEmpty() || Telp.isEmpty() || alamat.isEmpty() || prodi.isEmpty() || JK.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Data Tidak Boleh kososng");
                }else {
                    JOptionPane.showMessageDialog(null,"Data " +nama+ "Berhasil Disimpan");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new register();
        frame.setVisible(true);
    }
}
