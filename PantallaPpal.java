package grafico;

import javax.swing.JTextField;

import logica.Operaciones;

public class PantallaPpal extends javax.swing.JFrame {

    private javax.swing.JButton botonConvertir;
    private javax.swing.JButton botonRefrescar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JComboBox<String> boxmoneda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTextArea texto;
    private javax.swing.JTextField txtMoneda;
    private javax.swing.JTextField txtResultado;
	
    double valor, resultado;
    int tipo_moneda;

    public PantallaPpal() {
        initComponents();
    }

    	private void initComponents() {

        	scroll = new javax.swing.JScrollPane();
        
        	texto = new javax.swing.JTextArea();
        
        	jLabel1 = new javax.swing.JLabel();
        	jLabel2 = new javax.swing.JLabel();
        	jLabel3 = new javax.swing.JLabel();
        
        	boxmoneda = new javax.swing.JComboBox<>();
        
        	txtMoneda = new javax.swing.JTextField();
        	txtMoneda.setHorizontalAlignment(JTextField.CENTER);
        	
        	txtResultado = new javax.swing.JTextField();
        	txtResultado.setHorizontalAlignment(JTextField.CENTER);
        	
        	botonSalir = new javax.swing.JButton();
        	botonRefrescar = new javax.swing.JButton();
        	botonConvertir = new javax.swing.JButton();

        
        	texto.setColumns(20);
        	texto.setRows(5);
        	scroll.setViewportView(texto);

        	setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        	jLabel1.setFont(new java.awt.Font("Dialog", 0, 18));
        
        	jLabel1.setText("                         Seleccione monenda a convertir");

        	boxmoneda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "   Peso Arg. a Dólar", "   Peso Arg. a Euros", "   Peso Arg. a Libras Esterlinas", "   Peso Arg. a Yen Japonés", "   Peso Arg. a Won sul-coreano", "   Dólar a Peso Arg.", "   Euros a Peso Arg.", "   Libras Esterlinas a Peso Arg.", "   Yen Japonés a Peso Arg.", "   Won sul-coreano a Peso Arg." }));

        	jLabel2.setText("Importe a Convertir");

        	botonSalir.setText("Salir");
        	botonSalir.addActionListener(new java.awt.event.ActionListener() {
            
        		public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            
        		}
        	});

        
        	jLabel3.setText("Importe convertirdo");

        	botonRefrescar.setText("Refrescar");
        	botonRefrescar.addActionListener(new java.awt.event.ActionListener() {

        		public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            
        		}
        	});

        	botonConvertir.setText("Convertir");
        	botonConvertir.addActionListener(new java.awt.event.ActionListener() {
        		
        		public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_convertirActionPerformed(evt);
            
        		}
        	});

        
        	javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        	getContentPane().setLayout(layout);
        
        	layout.setHorizontalGroup(
        			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            	.addComponent(boxmoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
            	.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
            
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(botonConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(210, 210, 210))
                    
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
                    
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(botonRefrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))))
        );
        
        
        layout.setVerticalGroup(
        		layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            
        	.addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(boxmoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(botonRefrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }
    
    	private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {

        txtMoneda.setText("");
        txtResultado.setText("");
    
    	}

  
    	private void btn_convertirActionPerformed(java.awt.event.ActionEvent evt) {
        
    		valor = Double.parseDouble(txtMoneda.getText());
    		tipo_moneda = boxmoneda.getSelectedIndex();

    		Operaciones operacion = new Operaciones();

    		operacion.setImporte(valor);
    		operacion.setMoneda(tipo_moneda);
    		resultado = operacion.convertir();

    		txtResultado.setText(Double.toString(resultado));
        
    	}


    	private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {
       
        this.dispose();
        
    	}
}

