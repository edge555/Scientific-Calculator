package scientific.calculator;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class SciCalc extends javax.swing.JFrame {
    String s,a;
    double[] num=new double[500];
    String[] op=new String[500];
    String[] in=new String[500];
    int ind1,ind2,ind3,i,j,k;
    double x,y,ans,memory;
    boolean on=false;
    
    public SciCalc() {
        initComponents();
    }
    private static String dellast(String str) {
        return str.substring(0, str.length() - 1);
    }
    private int nCr(int n,int r)
    {
	if(r==0 || n==r)
            return 1;
	else
            return nCr(n-1,r)+nCr(n-1,r-1);
    }
    private int fact(int n)
    {
        if(n==1)
            return 1;
        else
            return fact(n-1)*n;
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jSeparator1 = new javax.swing.JSeparator();
        b0 = new javax.swing.JButton();
        bncr = new javax.swing.JButton();
        bpowten = new javax.swing.JButton();
        bdot = new javax.swing.JButton();
        beq = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tf = new javax.swing.JTextArea();
        b1 = new javax.swing.JButton();
        bplus = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        bmin = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        bmul = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        bdiv = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        bc = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        bac = new javax.swing.JButton();
        broot = new javax.swing.JButton();
        bmp = new javax.swing.JButton();
        bmn = new javax.swing.JButton();
        bmod = new javax.swing.JButton();
        bm = new javax.swing.JButton();
        bsq = new javax.swing.JButton();
        bcos = new javax.swing.JButton();
        bsin = new javax.swing.JButton();
        bpown = new javax.swing.JButton();
        btan = new javax.swing.JButton();
        blog = new javax.swing.JButton();
        bacos = new javax.swing.JButton();
        basin = new javax.swing.JButton();
        bfac = new javax.swing.JButton();
        batan = new javax.swing.JButton();
        bon = new javax.swing.JButton();
        boff = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Scientific Calculator");
        setForeground(java.awt.Color.darkGray);
        setIconImages(null);
        setResizable(false);

        b0.setText("0");
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });

        bncr.setText("nCr");
        bncr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bncrActionPerformed(evt);
            }
        });

        bpowten.setText("x10^");
        bpowten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpowtenActionPerformed(evt);
            }
        });

        bdot.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bdot.setText(".");
        bdot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdotActionPerformed(evt);
            }
        });

        beq.setText("=");
        beq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beqActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        tf.setColumns(20);
        tf.setFont(new java.awt.Font("Monospaced", 0, 28)); // NOI18N
        tf.setRows(5);
        jScrollPane1.setViewportView(tf);

        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        bplus.setText("+");
        bplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bplusActionPerformed(evt);
            }
        });

        b3.setText("3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b2.setText("2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        bmin.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        bmin.setText("-");
        bmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bminActionPerformed(evt);
            }
        });

        b4.setText("4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        bmul.setText("x");
        bmul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmulActionPerformed(evt);
            }
        });

        b6.setText("6");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b5.setText("5");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        bdiv.setText("/");
        bdiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdivActionPerformed(evt);
            }
        });

        b7.setText("7");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        bc.setText("C");
        bc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcActionPerformed(evt);
            }
        });

        b9.setText("9");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        b8.setText("8");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        bac.setText("AC");
        bac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bacActionPerformed(evt);
            }
        });

        broot.setText("sqrt");
        broot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brootActionPerformed(evt);
            }
        });

        bmp.setText("M+");
        bmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmpActionPerformed(evt);
            }
        });

        bmn.setText("M-");
        bmn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmnActionPerformed(evt);
            }
        });

        bmod.setText("%");
        bmod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmodActionPerformed(evt);
            }
        });

        bm.setText("M");
        bm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmActionPerformed(evt);
            }
        });

        bsq.setText("x^2");
        bsq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsqActionPerformed(evt);
            }
        });

        bcos.setText("cos");
        bcos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcosActionPerformed(evt);
            }
        });

        bsin.setText("sin");
        bsin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsinActionPerformed(evt);
            }
        });

        bpown.setText("x^n");
        bpown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpownActionPerformed(evt);
            }
        });

        btan.setText("tan");
        btan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btanActionPerformed(evt);
            }
        });

        blog.setText("log");
        blog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blogActionPerformed(evt);
            }
        });

        bacos.setText("acos");
        bacos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bacosActionPerformed(evt);
            }
        });

        basin.setText("asin");
        basin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basinActionPerformed(evt);
            }
        });

        bfac.setText("x !");
        bfac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bfacActionPerformed(evt);
            }
        });

        batan.setText("atan");
        batan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batanActionPerformed(evt);
            }
        });

        bon.setText("ON");
        bon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bonActionPerformed(evt);
            }
        });

        boff.setText("OFF");
        boff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boffActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bmul, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bdiv, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bc, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bac, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(blog, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bfac, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(basin, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bacos, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(batan, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bdot, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bpowten, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bncr, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(beq, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bplus, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bmin, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(broot, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bmod, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bmn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bmp, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bm, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bsq, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bpown, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bsin, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bcos, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btan, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bon, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(boff, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boff, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(blog, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bacos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(basin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bfac, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(batan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bsq, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bcos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bsin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bpown, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(broot, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bmp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bmn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bmod, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bm, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bac, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bmul, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bdiv, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bplus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bmin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bncr, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bpowten, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bdot, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(beq, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
        if(!on)
            return;
        s+="0";
        tf.setText(s);
    }//GEN-LAST:event_b0ActionPerformed

    private void bncrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bncrActionPerformed
        if(!on || s.isEmpty())
            return;
        s+='C';
        tf.setText(s);
    }//GEN-LAST:event_bncrActionPerformed

    private void bpowtenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpowtenActionPerformed
        if(!on || s.isEmpty())
            return;
        s+="x10^";
        tf.setText(s);
    }//GEN-LAST:event_bpowtenActionPerformed

    private void bdotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdotActionPerformed
        if(!on)
            return;
        s+=".";
        tf.setText(s);
    }//GEN-LAST:event_bdotActionPerformed

    private void beqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beqActionPerformed
        if(!on)
            return;
        String temp="";
        for(j=0;j<=s.length();j++)
        {
            if(j==s.length())
            {
                in[++ind3]=temp;
                    continue;
            }
            if(s.charAt(j)=='+' || s.charAt(j)=='-' || s.charAt(j)=='x' || s.charAt(j)=='/' || s.charAt(j)=='%')
            {
                in[++ind3]=temp;
                temp="";
                op[++ind2]=Character.toString(s.charAt(j));
            }
            else
                temp+=s.charAt(j);
        }
        boolean error=false;
        for(i=0;i<=ind3;i++)
        {
            temp=in[i];
            boolean c=false,fact=false,pow=false,log=false,sin=false,cos=false;
            boolean tan=false,asin=false,acos=false,atan=false,numm=true,root=false;
            for(j=0;j<temp.length();j++)
            {
                if(temp.charAt(j)=='C')
                {
                    c=true;
                    numm=false;
                    break;
                }
                if(temp.charAt(j)=='l')
                {
                    log=true;
                    numm=false;
                    break;
                }
                else if(temp.charAt(j)=='^')
                {
                    pow=true;
                    numm=false;
                    break;
                }
                else if(temp.charAt(j)=='!')
                {
                    fact=true;
                    numm=false;
                    break;
                }
                else if(temp.charAt(j)=='s')
                {
                    sin=true;
                    numm=false;
                    break;
                }
                else if(temp.charAt(j)=='c')
                {
                    cos=true;
                    numm=false;
                    break;
                }
                else if(temp.charAt(j)=='t')
                {
                    tan=true;
                    numm=false;
                    break;
                }
                else if(temp.charAt(j)=='a')
                {
                    if(temp.charAt(j+1)=='s')
                    {
                        asin=true;
                        numm=false;
                        break;
                    }
                    else if(temp.charAt(j+1)=='c')
                    {
                        acos=true;
                        numm=false;
                        break;
                    }
                    else if(temp.charAt(j+1)=='t')
                    {
                        atan=true;
                        numm=false;
                        break;
                    }
                }
                else if(temp.charAt(j)=='r')
                {
                    root=true;
                    numm=false;
                    break;
                }
            }
            if(numm)
            {
                x=Double.parseDouble(temp);
                num[++ind1]=x;
                continue;
            }
            DecimalFormat df=new DecimalFormat("#.####");
            df.setRoundingMode(RoundingMode.CEILING);
            if(c)
            {
                boolean chk=false;
                String right="",left="";
                for(j=0;j<in[i].length();j++)
                {
                    if(in[i].charAt(j)=='C')
                        chk=true;
                    else if(chk)
                        right+=in[i].charAt(j);
                    else
                        left+=in[i].charAt(j);
                }
                int ans=nCr(Integer.valueOf(left),Integer.valueOf(right));
                num[++ind1]=Double.valueOf(ans);
            }
            else if(fact)
            {
                String s1=dellast(in[i]);
                int ans=fact(Integer.valueOf(s1));
                num[++ind1]=Double.valueOf(ans);
            }
            else if(pow)
            {
                boolean chk=false;
                String right="",left="";
                for(j=0;j<in[i].length();j++)
                {
                    if(in[i].charAt(j)=='^')
                        chk=true;
                    else if(chk)
                        right+=in[i].charAt(j);
                    else
                        left+=in[i].charAt(j);
                }
                double ans=Math.pow(Integer.valueOf(left),Integer.valueOf(right));
                num[++ind1]=ans;
            }
            else if(log)
            {
                boolean chk=false;
                String s1="";
                for(j=0;j<in[i].length();j++)
                {
                    if(in[i].charAt(j)>='0' && in[i].charAt(j)<='9')
                        chk=true;
                    if(chk)
                        s1+=in[i].charAt(j);
                }
                double d=Double.parseDouble(s1);
                num[++ind1]=Math.log(d);
            }
            if(root)
            {
                String s1=temp.substring(4,temp.length());
                x=Double.parseDouble(s1);
                num[++ind1]=Math.sqrt(x);        
            }
            else if(sin)
            {
                boolean chk=false;
                String s1="";
                for(j=0;j<in[i].length();j++)
                {
                    if(in[i].charAt(j)>='0' && in[i].charAt(j)<='9')
                        chk=true;
                    if(chk)
                        s1+=in[i].charAt(j);
                }
                int angle=Integer.parseInt(s1);
                double ans=Math.sin(Math.toRadians(angle));
                num[++ind1]=Double.parseDouble(df.format(ans));
            }
            else if(cos)
            {
                boolean chk=false;
                String s1="";
                for(j=0;j<in[i].length();j++)
                {
                    if(in[i].charAt(j)>='0' && in[i].charAt(j)<='9')
                        chk=true;
                    if(chk)
                        s1+=in[i].charAt(j);
                }
                int angle=Integer.parseInt(s1);
                double ans=Math.cos(Math.toRadians(angle));
                num[++ind1]=Double.parseDouble(df.format(ans));
            }
            else if(tan)
            {
                boolean chk=false;
                String s1="";
                for(j=0;j<in[i].length();j++)
                {
                    if(in[i].charAt(j)>='0' && in[i].charAt(j)<='9')
                        chk=true;
                    if(chk)
                        s1+=in[i].charAt(j);
                }
                int angle=Integer.parseInt(s1);
                double ans=Math.tan(Math.toRadians(angle));
                num[++ind1]=Double.parseDouble(df.format(ans));
                System.out.println(Math.tan(Math.toRadians(angle)));
            }
            else if(asin)
            {
                boolean chk=false;
                String s1="";
                for(j=0;j<in[i].length();j++)
                {
                    if(in[i].charAt(j)>='0' && in[i].charAt(j)<='9')
                        chk=true;
                    if(chk)
                        s1+=in[i].charAt(j);
                }
                x=Double.parseDouble(s1);
                x=Math.asin(Math.toRadians(x));
                num[++ind1]=Double.parseDouble(df.format(x));
            }
            else if(acos)
            {
                boolean chk=false;
                String s1="";
                for(j=0;j<in[i].length();j++)
                {
                    if(in[i].charAt(j)>='0' && in[i].charAt(j)<='9')
                        chk=true;
                    if(chk)
                        s1+=in[i].charAt(j);
                }
                x=Double.parseDouble(s1);
                x=Math.acos(Math.toRadians(x));
                num[++ind1]=Double.parseDouble(df.format(x));
            }
            else if(atan)
            {
                boolean chk=false;
                String s1="";
                for(j=0;j<in[i].length();j++)
                {
                    if(in[i].charAt(j)>='0' && in[i].charAt(j)<='9')
                        chk=true;
                    if(chk)
                        s1+=in[i].charAt(j);
                }
                x=Double.parseDouble(s1);
                x=Math.tan(Math.toRadians(x));
                num[++ind1]=Double.parseDouble(df.format(x));
            }
        }
        ans=num[0];
        for(i=0;i<=ind2;i++)
        {
            if(op[i].equals("/")|| (op[i].equals("%")))
            {
                if(num[i+1]==0)
                {
                    error=true;
                    break;
                }
            }
            if(op[i].equals("+"))
                ans+=num[i+1];
            if(op[i].equals("-"))
                ans-=num[i+1];
            if(op[i].equals("x"))
                ans*=num[i+1];
            if(op[i].equals("/"))
                ans/=num[i+1];
            if(op[i]=="%")
                ans%=num[i+1];
        }
        if(error)
            tf.setText("ERROR");
        else
        {
            String s2=String.valueOf(ans);
            tf.setText(s2);
        }
    }//GEN-LAST:event_beqActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        if(!on)
            return;
        s+="1";
        tf.setText(s);
    }//GEN-LAST:event_b1ActionPerformed

    private void bplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bplusActionPerformed
        if(!on || s.isEmpty())
            return;
        s+="+";
        tf.setText(s);
    }//GEN-LAST:event_bplusActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        if(!on)
            return;
        s+="3";
        tf.setText(s);
    }//GEN-LAST:event_b3ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        if(!on)
            return;
        s+="2";
        tf.setText(s);
    }//GEN-LAST:event_b2ActionPerformed

    private void bminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bminActionPerformed
        if(!on || s.isEmpty())
            return;
        s+="-";
        tf.setText(s);
    }//GEN-LAST:event_bminActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        if(!on)
            return;
        s+="4";
        tf.setText(s);
    }//GEN-LAST:event_b4ActionPerformed

    private void bmulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmulActionPerformed
        if(!on || s.isEmpty())
            return;
        s+="x";
        tf.setText(s);
    }//GEN-LAST:event_bmulActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        if(!on)
            return;
        s+="6";
        tf.setText(s);
    }//GEN-LAST:event_b6ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        if(!on)
            return;
        s+="5";
        tf.setText(s);
    }//GEN-LAST:event_b5ActionPerformed

    private void bdivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdivActionPerformed
        if(!on || s.isEmpty())
            return;
        s+="/";
        tf.setText(s);
    }//GEN-LAST:event_bdivActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        if(!on)
            return;
        s+="7";
        tf.setText(s);
    }//GEN-LAST:event_b7ActionPerformed

    private void bcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcActionPerformed
        if(!on)
            return;
        s=dellast(s);
        tf.setText(s);
    }//GEN-LAST:event_bcActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        if(!on)
            return;
        s+="9";
        tf.setText(s);
    }//GEN-LAST:event_b9ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        if(!on)
            return;
        s+="8";
        tf.setText(s);
    }//GEN-LAST:event_b8ActionPerformed

    private void bacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bacActionPerformed
        if(!on)
            return;
        s="";
        tf.setText("0");
        ind1=-1;
        ind2=-1;
        ind3=-1;
    }//GEN-LAST:event_bacActionPerformed

    private void brootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brootActionPerformed
        if(!on)
            return;
        s+="root";
        tf.setText(s);
    }//GEN-LAST:event_brootActionPerformed

    private void bmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmpActionPerformed
        if(!on)
            return;
        memory=ans;
    }//GEN-LAST:event_bmpActionPerformed

    private void bmnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmnActionPerformed
        if(!on)
            return;
        memory=-1;
    }//GEN-LAST:event_bmnActionPerformed

    private void bmodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmodActionPerformed
        if(!on || s.isEmpty())
            return;
        s+="%";
        tf.setText(s);
    }//GEN-LAST:event_bmodActionPerformed

    private void bmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmActionPerformed
        if(!on || memory==-1)
            return;
    }//GEN-LAST:event_bmActionPerformed

    private void bsqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsqActionPerformed
        if(!on || s.isEmpty())
            return;
        s+="^2";
        tf.setText(s);
    }//GEN-LAST:event_bsqActionPerformed

    private void bcosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcosActionPerformed
        if(!on)
            return;
        s+="cos";
        tf.setText(s);
    }//GEN-LAST:event_bcosActionPerformed

    private void bsinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsinActionPerformed
        if(!on)
            return;
        s+="sin";
        tf.setText(s);
    }//GEN-LAST:event_bsinActionPerformed

    private void bpownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpownActionPerformed
        if(!on || s.isEmpty())
            return;
        s+="^";
        tf.setText(s);
    }//GEN-LAST:event_bpownActionPerformed

    private void btanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btanActionPerformed
        if(!on)
            return;
        s+="tan";
        tf.setText(s);
    }//GEN-LAST:event_btanActionPerformed

    private void blogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blogActionPerformed
        if(!on)
            return;
        s+="log";
        tf.setText(s);
    }//GEN-LAST:event_blogActionPerformed

    private void bacosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bacosActionPerformed
        if(!on)
            return;
        s+="acos";
        tf.setText(s);
    }//GEN-LAST:event_bacosActionPerformed

    private void basinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basinActionPerformed
       if(!on)
            return;
       s+="asin";
       tf.setText(s);
    }//GEN-LAST:event_basinActionPerformed

    private void bfacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bfacActionPerformed
        if(!on || s.isEmpty())
            return;
        s+="!";
        tf.setText(s);
    }//GEN-LAST:event_bfacActionPerformed

    private void batanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batanActionPerformed
        if(!on)
            return;
        s+="atan";
        tf.setText(s);
    }//GEN-LAST:event_batanActionPerformed

    private void bonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bonActionPerformed
        on=true;
        s="";
        tf.setText("0");
        ind1=-1;
        ind2=-1;
        ind3=-1;
        memory=0;
    }//GEN-LAST:event_bonActionPerformed

    private void boffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boffActionPerformed
        on=false;
        tf.setText("");
        tf.setEditable(false);
    }//GEN-LAST:event_boffActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SciCalc().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bac;
    private javax.swing.JButton bacos;
    private javax.swing.JButton basin;
    private javax.swing.JButton batan;
    private javax.swing.JButton bc;
    private javax.swing.JButton bcos;
    private javax.swing.JButton bdiv;
    private javax.swing.JButton bdot;
    private javax.swing.JButton beq;
    private javax.swing.JButton bfac;
    private javax.swing.JButton blog;
    private javax.swing.JButton bm;
    private javax.swing.JButton bmin;
    private javax.swing.JButton bmn;
    private javax.swing.JButton bmod;
    private javax.swing.JButton bmp;
    private javax.swing.JButton bmul;
    private javax.swing.JButton bncr;
    private javax.swing.JButton boff;
    private javax.swing.JButton bon;
    private javax.swing.JButton bplus;
    private javax.swing.JButton bpown;
    private javax.swing.JButton bpowten;
    private javax.swing.JButton broot;
    private javax.swing.JButton bsin;
    private javax.swing.JButton bsq;
    private javax.swing.JButton btan;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextArea tf;
    // End of variables declaration//GEN-END:variables
}