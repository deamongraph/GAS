
package GAS;



import java.util.*;

import GAS.Data;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import GAS.Listas;

public class MF extends javax.swing.JFrame {

 int indice=0;
 int medio=1;
 int els=0;
 int cont=0;
Data d = new Data();
    public  void agregarDato(String dato)
    {
      d.Datos.add(dato);
    } 
 
    public MF() {
        initComponents();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaTrabajo = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GAS - Graphic Algorithm Simulator");

        jButton1.setText("Inicio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Entrada");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Proceso");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("IF");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Salida ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Fin");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccione el elemento a a単adir");

        jButton7.setText("Generar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        AreaTrabajo.setColumns(20);
        AreaTrabajo.setEditable(false);
        AreaTrabajo.setRows(5);
        AreaTrabajo.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                AreaTrabajoCaretUpdate(evt);
            }
        });
        jScrollPane1.setViewportView(AreaTrabajo);

        jLabel2.setText("Pseudo");

        jButton8.setText("Limpiar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Else");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Compilar");
        jButton10.setToolTipText("");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jMenu3.setText("Archivo");

        jMenuItem1.setText("Abrir");
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Guardar");
        jMenu3.add(jMenuItem2);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Editar");
        jMenu4.setToolTipText("");

        jMenuItem3.setText("Deshacer");
        jMenu4.add(jMenuItem3);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jButton8))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGap(330, 330, 330)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)))
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton9)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jButton8))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    String s = JOptionPane.showInputDialog("Digite un valor para su variable\n Ejemplo: X ");
    if(!s.matches("\\w+"))
        JOptionPane.showMessageDialog(rootPane, "La variable debe contener solo letras");
    else{  
     agregarDato(s);
     AreaTrabajo.append("Leer: "+d.Datos.get(indice)+"\n");
     indice++;
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    
        String x = JOptionPane.showInputDialog("Digite la operacion a efectuar \n Ejemplo X=X+1 ");
         //faltan numeros negativos
         if(!x.matches("([\\w+][\\=])"
                 + "([\\-]?([\\d]+[.]?[\\d]*)*[\\w]*)+"
                 + "([\\+]?|[\\-]?|[\\*]?|[\\/]?|[\\%]?)?"
                 + "([\\-]?([\\d]+[.]?[\\d]*)*[\\w]*)+"))
        JOptionPane.showMessageDialog(rootPane, "La variable debe ser de la forma: X=n");
         else{
        agregarDato(x);   
        AreaTrabajo.append("Hacer: "+d.Datos.get(indice)+"\n");
        indice++;
         }
    }//GEN-LAST:event_jButton3ActionPerformed

    
    
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    String z = JOptionPane.showInputDialog("Digite la condicion a cumplir \n X>0 ");    
     if(!z.matches("([\\d]+[.]?[\\d]*)*[\\w]*"
             + "([\\>]?|[\\<]?|[\\>=]?|[\\<=]?|[\\=]{2}|[\\!=]?"
                + ")([\\d]+[.]?[\\d]*)*[\\w]*"))
        JOptionPane.showMessageDialog(rootPane, "La variable debe ser de la forma: X>n ");
         else{
     agregarDato(z);  
    
          
     AreaTrabajo.append("Si: "+d.Datos.get(indice)+"\n");
     indice++; 
     }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      String u = JOptionPane.showInputDialog("Digite la variable que desea imprimir");
       if(!u.matches("\\w+"))
        JOptionPane.showMessageDialog(rootPane, "La variable debe contener solo letras");
    else{  
     agregarDato(u);
     AreaTrabajo.append("Imprimir: " +d.Datos.get(indice)+"\n");
     indice++;
       }
    }//GEN-LAST:event_jButton5ActionPerformed
//INICIO
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     if(d.Datos.contains("INICIO"))
        JOptionPane.showMessageDialog(rootPane, "Solo se puede tener un inicio");
     else{
     agregarDato("INICIO");
     AreaTrabajo.append(d.Datos.get(indice)+"\n");
     indice++;
     
     }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
   
        PintaAlgoritmo p = new PintaAlgoritmo();
          
           // caso base inicio siempre en el medio  
        
        for(int e=0;e<27;e++)
            {
                p.agregarListaE(e,0);
                p.agregarListaS(e,0);
              }
            
        
          p.agregarNodo(medio, d.Datos.get(0));
          for(int i=1; i<d.Datos.size();i++)
          {
             // NODOS POR EL MEDIO
             if(!d.Datos.get(i).contains(">") && !"ELSE".equals(d.Datos.get(i)) && !"FIN".equals(d.Datos.get(i)))
            {
              p.agregarListaE(i,medio);
              p.agregarListaS(i,medio+3);
                
                //normales
              medio = medio+3;              
              p.agregarNodo(medio, d.Datos.get(i));
            
              //IF
            }else
             if(d.Datos.get(i).contains(">"))
            {
              p.agregarListaE(i,medio);//desde donde
              
             medio = medio+3;
             p.agregarNodo(medio, d.Datos.get(i));
             p.agregarListaS(i,medio);//hasta donde
             els=medio;
          //ELSE
            }else
             
            if("ELSE".equals(d.Datos.get(i)))
            {
            p.agregarListaE(i,els);//desde donde
            medio=medio-1;
            p.agregarNodo(medio,d.Datos.get(i)); 
            p.agregarListaS(i,medio);//hasta donde
            }             
          
            if("FIN".equals(d.Datos.get(i)))
            {
             p.agregarListaE(i,medio);//desde donde
             p.agregarNodo(25, d.Datos.get(i));//hasta donde
             p.agregarListaS(i,25);//hasta donde 
            } 
          }
       
        
         // p.listaE[0]=1;
      //   p.listaS[0]=5;
         
       
       
       
           p.inicializar();
          
          p.pack();
          p.show();
         
       
        
     
       
      //  AreaTrabajo.setText("");
      //  for(int i=0;i<d.Datos.size();i++)
      //  AreaTrabajo.append(d.Datos.get(i)+"\n");     
    }//GEN-LAST:event_jButton7ActionPerformed

    private void AreaTrabajoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_AreaTrabajoCaretUpdate
     
    }//GEN-LAST:event_AreaTrabajoCaretUpdate
//FIN
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         
        if(d.Datos.contains("FIN") && !d.Datos.get(0).equals("INICIO"))
        JOptionPane.showMessageDialog(rootPane, "Solo se puede tener un inicio");
     else{         
       
            agregarDato("FIN");          
     AreaTrabajo.append(d.Datos.get(indice)+"\n");
     indice++;
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
         AreaTrabajo.setText("");
             
                d.Datos.clear();
    
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
     // String z = JOptionPane.showInputDialog("Digite la condicion a cumplir \n X>0 ");
     agregarDato("ELSE");     
    
          
     AreaTrabajo.append(d.Datos.get(indice)+"\n");
     indice++; 
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       String Codigo_C="int main()"+"\n" + "{";
      
     
       char[] array;
       array=AreaTrabajo.getText().toCharArray();  
       System.out.print(AreaTrabajo.getText());
       char[] array2 = new char [array.length-4];
       array2[0]='i';
       array2[1]='n';
       array2[2]='t';
       array2[3]=' ';
       int control=-1,pos = 0;
       for (int i=6;i<array2.length;i++)
       { 
           array2[i-2]=array[i];
           
           if ('\n'== array2[i-2])
           {
              control++;
              pos=i-2;
           }
           if (control>0)
           {
                    array2[pos]=';';
           }
           if (array2[i-2]==';')
                   array2[i-2+1]='\n';
       }
       Codigo_C=(String.valueOf(array2));
       Codigo_C.split(";");
       AreaTrabajo.append("int main()"+"\n" + "{"+"\n"+"\t"+Codigo_C+"\n"+"\t"+"return 0;"+"\n"+"}");
      // Compilacion.CodeText.setText("int main()"+"\n" + "{"+"\n"+"\t"+Codigo_C+"\n"+"\t"+"return 0;"+"\n"+"}");      
        
    }//GEN-LAST:event_jButton10ActionPerformed

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
        
            public void run() {
                new MF().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaTrabajo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}