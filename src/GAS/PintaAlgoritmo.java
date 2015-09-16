package GAS;


import java.awt.*;
import java.awt.event.ComponentEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;
import GAS.MainForm;

public class PintaAlgoritmo extends JFrame {
 
    private ArrayList<NodeLabel> nodex = new ArrayList<>();    
    public  int[] listaE = new int[27];
    public  int[] listaS = new int[27];
    public int[] comp = new int[27];
    String[] s = new String[27];
    
      
    private JPanel paintPanel ;
    public PintaAlgoritmo() {
        
      
      initComponents();
    
   
        
    }
    
       private void paintNodeConnections(Graphics g,int i, int j, String Sale, String Entra) {
        Graphics2D g2d = (Graphics2D)g;
        // draw line between right connection point of node1
        // and the left connection point of node2
        
        Point p1 = nodex.get(i).getConnectionPoint(Sale);
        Point p2 = nodex.get(j).getConnectionPoint(Entra);
        
        g2d.drawLine(p1.x, p1.y, p2.x, p2.y);
     
    }
       
     //s = " inicio","
    public void PaintNode( int[]x, int[]y)
    {
  
  
    
  
        
       paintPanel = new  JPanel() 
       { 
          public void paintComponent(Graphics g)
           {
               for(int i=0;i<27;i++)
               {       
                   
                   System.out.print(s[i]+"\n");
                   if(listaE[i]!=0 && listaS[i]!=0)
                   paintNodeConnections(g,listaE[i],listaS[i],"BOTTOM","TOP");
                    
               }
            }
        };
        
        paintPanel.setLayout(null);
        for(int i = 0; i<s.length;i++){
        //    private NodeLabel node3;        
        nodex.add(new NodeLabel(s[i]));          
        //paintNodeConnections(g,0,1,"RIGHT","LEFT");
        //orientacion del texto        
        nodex.get(i).setHorizontalAlignment(SwingConstants.CENTER);       
        //color y bordes        
        nodex.get(i).setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));        
        paintPanel.add(nodex.get(i));       
        nodex.get(i).setBounds(x[i], y[i], 56, 28);
        nodex.get(i).setVisible(false);
        
         if(s[i]!=null)
         {
         
         nodex.get(i).setVisible(true);
         }
        
        }
       
        
        
        getContentPane().add(paintPanel, BorderLayout.CENTER);
    }
    public void agregarNodo(int i ,String dato)
    {
           s[i]=dato;        
    }
    
    public void agregarListaE(int i ,int dato)
    {
    listaE[i]=dato;
    }
    public void agregarListaS(int i ,int dato)
    {
    listaS[i]=dato;
    }
    
    public void inicializar()
    {
      
        int[] x={0,120,220,
                 0,120,220,
                 0,120,220,
                 0,120,220,
                 0,120,220,
                 0,120,220,
                 0,120,220,
                 0,120,220,
                 0,120,220
        };
        
        int[] y={0,0,0,
                 60,60,60,
                 120,120,120,
                 180,180,180,
                 240,240,240,
                 300,300,300,
                 360,360,360,
                 420,420,420,
                 480,480,480          
        }; 
        
        
        PaintNode(x,y);
    
    }
    public void initComponents() {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setMinimumSize(new Dimension(300, 580));
        // this just overrides the paintComponent() method 
        // of the created panel.
        
     
    }
    /** Small class to add some additionial behavior for nodes */
    class NodeLabel extends JLabel {
        Map<String, Point> connectionPoints = new HashMap<String, Point>();
        public NodeLabel(String text) {
            super(text);
            addComponentListener(new java.awt.event.ComponentAdapter(){
                 public void componentResized(java.awt.event.ComponentEvent evt) {
                    mapConnectionPoints();
                }
                public void componentMoved(ComponentEvent e) {
                    mapConnectionPoints();
                }
                 
            });
        }
        
        // updates the mapped positions of the connection points
        // called whenever the component get's resized or moved
        private void mapConnectionPoints(){
            connectionPoints.clear();
            Point point = new Point(getX(),getY()+getHeight()/2);
            connectionPoints.put("LEFT", point);
            point = new Point(getX() + getWidth(), getY() + getHeight()/2);
            connectionPoints.put("RIGHT", point);
            point = new Point(getX() + getWidth()/2, getY());
            connectionPoints.put("TOP", point);
            point = new Point(getX() + getWidth()/2, getY() + getHeight());
            connectionPoints.put("BOTTOM", point);
        }
        public Point getConnectionPoint(String key) {
            return connectionPoints.get(key);
        }
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PintaAlgoritmo().setVisible(true);
            }
        });  
    }
}