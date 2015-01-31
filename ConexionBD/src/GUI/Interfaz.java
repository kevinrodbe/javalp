package GUI;
import Entidades.postulante;
import CapaDatos.PrgPostulante;
import javax.swing.JOptionPane;
public class Interfaz extends javax.swing.JFrame {
    PrgPostulante prg;
    public Interfaz() {
        initComponents();
        prg=new PrgPostulante();
        ID.setText("AUTO-GENERADO :: "+prg.ColocarID());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField6 = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        JpIngresar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        APELLIDOP = new javax.swing.JTextField();
        APELLIDOM = new javax.swing.JTextField();
        NOMBRE = new javax.swing.JTextField();
        EDAD = new javax.swing.JTextField();
        Button_limpiar = new javax.swing.JButton();
        Button_grabar = new javax.swing.JButton();
        lblmsj = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        comboCarrera = new javax.swing.JComboBox();
        SEXO = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        JpVisualizar = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cbOpcion = new javax.swing.JComboBox();
        txtDato = new javax.swing.JTextField();
        Button_Buscar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        Button_MostrarTodo = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        IDM = new javax.swing.JTextField();
        APEPA_M = new javax.swing.JTextField();
        APEMA_M = new javax.swing.JTextField();
        NOMBREM = new javax.swing.JTextField();
        EDADM = new javax.swing.JTextField();
        FOTOM = new javax.swing.JLabel();
        Button_buscarM = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Button_grabarM = new javax.swing.JButton();
        SEXOM = new javax.swing.JTextField();
        cb_carrerasM = new javax.swing.JComboBox();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        IDB = new javax.swing.JTextField();
        APEPA_B = new javax.swing.JTextField();
        APEMA_B = new javax.swing.JTextField();
        NOMBREB = new javax.swing.JTextField();
        EDADB = new javax.swing.JTextField();
        SEXOB = new javax.swing.JTextField();
        cb_carrerasB = new javax.swing.JComboBox();
        Button_BuscarB = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        Button_Borrar = new javax.swing.JButton();
        FOTOB = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();

        jTextField6.setText("jTextField6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTRO");

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 18));
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATOS DEL POSTULANTE");

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 14));
        jLabel2.setText("IdAlumno              :");

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 14));
        jLabel3.setText("Apellido Paterno  :");

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 14));
        jLabel4.setText("Apellido Materno :");

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 14));
        jLabel5.setText("Nombre                  :");

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 14));
        jLabel6.setText("Edad                        :");

        jLabel7.setFont(new java.awt.Font("Georgia", 1, 14));
        jLabel7.setText("Sexo (M / F)           :");

        ID.setEditable(false);
        ID.setFont(new java.awt.Font("Georgia", 0, 12));
        ID.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        APELLIDOP.setFont(new java.awt.Font("Georgia", 0, 12));

        APELLIDOM.setFont(new java.awt.Font("Georgia", 0, 12));

        NOMBRE.setFont(new java.awt.Font("Georgia", 0, 12));

        EDAD.setFont(new java.awt.Font("Georgia", 0, 12));

        Button_limpiar.setText("LIMPIAR");
        Button_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_limpiarActionPerformed(evt);
            }
        });

        Button_grabar.setFont(new java.awt.Font("Georgia", 1, 18));
        Button_grabar.setText("GRABAR");
        Button_grabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_grabarActionPerformed(evt);
            }
        });

        lblmsj.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblmsj.setForeground(new java.awt.Color(255, 0, 0));
        lblmsj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel15.setFont(new java.awt.Font("Georgia", 1, 14));
        jLabel15.setText("Carrera                   :");

        comboCarrera.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione una opcion", "Ing. de Sistemas", "Ing. Industrial", "Ing. Informatica", "Ing. de Redes y Comunicaciones", "Ing. de Software", "Ing. de Telecomunicaciones", "Odontologia", "Gestion de Recursos Humanos", "Derecho", "Contabilidad y Finanzas", "Economia", "Ciencias de la Comunicacion", "Arquitectura", "Administracion", "Administracion de Negocios Internacionales", "Ing. Civil ", "Medicina Humana" }));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.jpg"))); // NOI18N

        javax.swing.GroupLayout JpIngresarLayout = new javax.swing.GroupLayout(JpIngresar);
        JpIngresar.setLayout(JpIngresarLayout);
        JpIngresarLayout.setHorizontalGroup(
            JpIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpIngresarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JpIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpIngresarLayout.createSequentialGroup()
                        .addGroup(JpIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JpIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ID, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                            .addComponent(APELLIDOP, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)))
                    .addGroup(JpIngresarLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(5, 5, 5)
                        .addComponent(APELLIDOM, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE))
                    .addGroup(JpIngresarLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NOMBRE, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE))
                    .addGroup(JpIngresarLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EDAD, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE))
                    .addGroup(JpIngresarLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SEXO, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))
                    .addComponent(lblmsj, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(JpIngresarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Button_grabar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 276, Short.MAX_VALUE)
                .addComponent(Button_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(JpIngresarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
            .addGroup(JpIngresarLayout.createSequentialGroup()
                .addComponent(jLabel19)
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        JpIngresarLayout.setVerticalGroup(
            JpIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpIngresarLayout.createSequentialGroup()
                .addGroup(JpIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JpIngresarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(JpIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(APELLIDOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(APELLIDOM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(EDAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(SEXO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(comboCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JpIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button_grabar)
                    .addComponent(Button_limpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblmsj, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Ingresar", JpIngresar);

        jLabel17.setFont(new java.awt.Font("Georgia", 1, 12));
        jLabel17.setText("Buscar por...");

        jLabel18.setFont(new java.awt.Font("Georgia", 1, 12));
        jLabel18.setText("Dato a Buscar...");

        cbOpcion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione una opcion", "IdAlumno", "Apellido Paterno", "Apellido Materno", "Edad", "Carrera" }));

        Button_Buscar.setFont(new java.awt.Font("Georgia", 1, 18));
        Button_Buscar.setText("Buscar");
        Button_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_BuscarActionPerformed(evt);
            }
        });

        Button_MostrarTodo.setFont(new java.awt.Font("Georgia", 1, 14));
        Button_MostrarTodo.setText("Mostrar Todo");
        Button_MostrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_MostrarTodoActionPerformed(evt);
            }
        });

        txtArea.setColumns(20);
        txtArea.setEditable(false);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        javax.swing.GroupLayout JpVisualizarLayout = new javax.swing.GroupLayout(JpVisualizar);
        JpVisualizar.setLayout(JpVisualizarLayout);
        JpVisualizarLayout.setHorizontalGroup(
            JpVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpVisualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JpVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JpVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDato, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(cbOpcion, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
            .addGroup(JpVisualizarLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(Button_MostrarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(225, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
        );
        JpVisualizarLayout.setVerticalGroup(
            JpVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpVisualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JpVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpVisualizarLayout.createSequentialGroup()
                        .addGroup(JpVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(cbOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JpVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txtDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Button_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(Button_MostrarTodo)
                .addGap(8, 8, 8)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Visualizar", JpVisualizar);

        jLabel8.setFont(new java.awt.Font("Georgia", 3, 18));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("MODIFICAR DATOS");

        jLabel9.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel9.setText("ID ALUMNO                           :");

        jLabel10.setFont(new java.awt.Font("Georgia", 1, 12));
        jLabel10.setText("NOMBRE                                 :");

        jLabel11.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel11.setText("APELLIDO PATERNO       :");

        jLabel12.setFont(new java.awt.Font("Georgia", 1, 12));
        jLabel12.setText("APELLIDO MATERNO      :");

        jLabel13.setFont(new java.awt.Font("Georgia", 1, 12));
        jLabel13.setText("EDAD                                        :");

        jLabel14.setFont(new java.awt.Font("Georgia", 1, 12));
        jLabel14.setText("SEXO                                        :");

        jLabel16.setFont(new java.awt.Font("Georgia", 1, 12));
        jLabel16.setText("CARRERA                              :");

        APEPA_M.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N

        APEMA_M.setFont(new java.awt.Font("Georgia", 0, 12));

        NOMBREM.setFont(new java.awt.Font("Georgia", 0, 12));

        EDADM.setFont(new java.awt.Font("Georgia", 0, 12));

        FOTOM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Button_buscarM.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        Button_buscarM.setText("BUSCAR");
        Button_buscarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_buscarMActionPerformed(evt);
            }
        });

        jTextArea1.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea1.setColumns(18);
        jTextArea1.setEditable(false);
        jTextArea1.setForeground(new java.awt.Color(255, 0, 0));
        jTextArea1.setRows(3);
        jTextArea1.setText("NOTA:\nSobre escriba los campos\ny pulse grabar");
        jTextArea1.setBorder(null);
        jScrollPane2.setViewportView(jTextArea1);

        Button_grabarM.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        Button_grabarM.setText("GRABAR");
        Button_grabarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_grabarMActionPerformed(evt);
            }
        });

        SEXOM.setFont(new java.awt.Font("Georgia", 0, 12));

        cb_carrerasM.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ing. de Sistemas", "Ing. Industrial", "Ing. Informatica", "Ing. de Redes y Comunicaciones", "Ing. de Software", "Ing. de Telecomunicaciones", "Odontologia", "Gestion de Recursos Humanos", "Derecho", "Contabilidad y Finanzas", "Economia", "Ciencias de la Comunicacion", "Arquitectura", "Administracion", "Administracion de Negocios Internacionales", "Ing. Civil ", "Medicina Humana" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IDM, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EDADM, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NOMBREM, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(APEMA_M, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(APEPA_M, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Button_grabarM, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SEXOM, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_carrerasM, 0, 192, Short.MAX_VALUE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(Button_buscarM))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FOTOM, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(IDM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_buscarM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(APEPA_M, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(APEMA_M, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(NOMBREM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(EDADM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(SEXOM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(cb_carrerasM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Button_grabarM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addComponent(FOTOM, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modificar", jPanel1);

        jLabel20.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 0));
        jLabel20.setText("ELIMINAR POSTULANTE");

        jLabel21.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel21.setText("ID ALUMNO                        :");

        jLabel22.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel22.setText("APELLIDO PATERNO    :");

        jLabel23.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel23.setText("APELLIDO MATERNO  :");

        jLabel24.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel24.setText("NOMBRE                             :");

        jLabel25.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel25.setText("EDAD                                    :");

        jLabel26.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel26.setText("SEXO                                     :");

        jLabel27.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel27.setText("CARRERA                           :");

        IDB.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N

        APEPA_B.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N

        NOMBREB.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N

        EDADB.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N

        SEXOB.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N

        cb_carrerasB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ing. de Sistemas", "Ing. Industrial", "Ing. Informatica", "Ing. de Redes y Comunicaciones", "Ing. de Software", "Ing. de Telecomunicaciones", "Odontologia", "Gestion de Recursos Humanos", "Derecho", "Contabilidad y Finanzas", "Economia", "Ciencias de la Comunicacion", "Arquitectura", "Administracion", "Administracion de Negocios Internacionales", "Ing. Civil ", "Medicina Humana" }));

        Button_BuscarB.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        Button_BuscarB.setText("BUSCAR");
        Button_BuscarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_BuscarBActionPerformed(evt);
            }
        });

        jTextArea2.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(204, 0, 0));
        jTextArea2.setRows(3);
        jTextArea2.setText("Nota:\nUna vez encontrado el postulante\npulse BORRAR");
        jScrollPane3.setViewportView(jTextArea2);

        Button_Borrar.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        Button_Borrar.setText("BORRAR");
        Button_Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_BorrarActionPerformed(evt);
            }
        });

        FOTOB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel20))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button_Borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_carrerasB, 0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SEXOB))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EDADB))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NOMBREB))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(APEMA_B))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(APEPA_B))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IDB, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FOTOB, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_BuscarB))))
                .addContainerGap(27, Short.MAX_VALUE))
            .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(IDB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_BuscarB))
                .addGap(2, 2, 2)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(APEPA_B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(APEMA_B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(NOMBREB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(EDADB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(SEXOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(cb_carrerasB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Button_Borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3)))
                    .addComponent(FOTOB, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Eliminar", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_grabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_grabarActionPerformed
        postulante postu=new postulante();
        postu.setID(prg.ColocarID());
        
        postu.setAPELLIDOP(APELLIDOP.getText().toUpperCase().trim());
        postu.setAPELLIDOM(APELLIDOM.getText().toUpperCase().trim());
        postu.setNOMBRE(NOMBRE.getText().toUpperCase().trim());
        postu.setEDAD(Integer.parseInt(EDAD.getText()));
        postu.setSEXO(SEXO.getText().toUpperCase().trim());
        postu.setCARRERA(comboCarrera.getSelectedItem().toString().trim());
        if(comboCarrera.getSelectedIndex()!=0){
            prg.Grabar(postu,lblmsj);
            ID.setText("AUTO-GENERADO :: "+prg.ColocarID());
            APELLIDOP.setText("");
            APELLIDOM.setText("");
            NOMBRE.setText("");
            EDAD.setText("");
            SEXO.setText("");
            comboCarrera.setSelectedIndex(0);
            APELLIDOP.requestFocus();
        } else
            JOptionPane.showMessageDialog(null,"ELIJA UNA OPCION !!","ERROR !!",JOptionPane.INFORMATION_MESSAGE);
            
    }//GEN-LAST:event_Button_grabarActionPerformed

    private void Button_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_limpiarActionPerformed
        ID.setText("AUTO-GENERADO :: "+prg.ColocarID());
        APELLIDOP.setText("");
        APELLIDOM.setText("");
        NOMBRE.setText("");
        EDAD.setText("");
        SEXO.setText("");
        APELLIDOP.requestFocus();
        comboCarrera.setSelectedIndex(0);
    }//GEN-LAST:event_Button_limpiarActionPerformed

    private void Button_MostrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_MostrarTodoActionPerformed
        prg.Listar(txtArea);
    }//GEN-LAST:event_Button_MostrarTodoActionPerformed

    private void Button_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_BuscarActionPerformed
        int opc=cbOpcion.getSelectedIndex();
        String dato=txtDato.getText().trim();
        prg.busqueda(opc,dato,txtArea);
    }//GEN-LAST:event_Button_BuscarActionPerformed

    private void Button_buscarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_buscarMActionPerformed
        String dato=IDM.getText().trim();
        prg.busquedaM(1,dato);
        postulante objP;        
        objP = (postulante)prg.busquedaM(1,dato);
        String edad=objP.getEDAD()+"";
        APEPA_M.setText(objP.getAPELLIDOP());
        APEMA_M.setText(objP.getAPELLIDOM());
        NOMBREM.setText(objP.getNOMBRE());
        EDADM.setText(edad);
        SEXOM.setText(objP.getSEXO());
        for(int i=0;i<cb_carrerasM.getItemCount();i++){
            if(cb_carrerasM.getItemAt(i).equals(objP.getCARRERA()))
                cb_carrerasM.setSelectedIndex(i);
        }
        prg.PonerFoto(dato,FOTOM);
        

    }//GEN-LAST:event_Button_buscarMActionPerformed

    private void Button_grabarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_grabarMActionPerformed
        String dato=IDM.getText().trim();
        prg.busquedaM(1,dato);
        postulante objPm;        
        objPm = (postulante)prg.busquedaM(1,dato);
        objPm.setAPELLIDOP(APEPA_M.getText().toUpperCase().trim());
        objPm.setAPELLIDOM(APEMA_M.getText().toUpperCase().trim());
        objPm.setNOMBRE(NOMBREM.getText().toUpperCase().trim());
        objPm.setEDAD(Integer.parseInt(EDADM.getText()));
        objPm.setSEXO(SEXOM.getText().toUpperCase().trim());
        objPm.setCARRERA(cb_carrerasM.getSelectedItem().toString().trim());
        prg.GrabarM(objPm);
    }//GEN-LAST:event_Button_grabarMActionPerformed

    private void Button_BuscarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_BuscarBActionPerformed
        String dato=IDB.getText().trim();
        prg.busquedaM(1,dato);
        postulante objP;        
        objP = (postulante)prg.busquedaM(1,dato);
        String edad=objP.getEDAD()+"";
        APEPA_B.setText(objP.getAPELLIDOP());
        APEMA_B.setText(objP.getAPELLIDOM());
        NOMBREB.setText(objP.getNOMBRE());
        EDADB.setText(edad);
        SEXOB.setText(objP.getSEXO());
        for(int i=0;i<cb_carrerasB.getItemCount();i++){
            if(cb_carrerasB.getItemAt(i).equals(objP.getCARRERA()))
                cb_carrerasB.setSelectedIndex(i);
        }
        prg.PonerFoto(dato,FOTOB);
             
    }//GEN-LAST:event_Button_BuscarBActionPerformed

    private void Button_BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_BorrarActionPerformed
        String dato=IDB.getText().trim();
        prg.busquedaM(1,dato);
        postulante objPb; 
        objPb = (postulante)prg.busquedaM(1,dato);
        objPb = (postulante)prg.busquedaM(1,dato);
        objPb.setAPELLIDOP(APEPA_B.getText().toUpperCase().trim());
        objPb.setAPELLIDOM(APEMA_B.getText().toUpperCase().trim());
        objPb.setNOMBRE(NOMBREB.getText().toUpperCase().trim());
        objPb.setEDAD(Integer.parseInt(EDADB.getText()));
        objPb.setSEXO(SEXOB.getText().toUpperCase().trim());
        objPb.setCARRERA(cb_carrerasB.getSelectedItem().toString().trim()); 
        prg.Borrar(objPb);
        APEPA_B.setText("");
        APEMA_B.setText("");
        NOMBREB.setText("");
        EDADB.setText("");
        SEXOB.setText("");
        cb_carrerasB.setSelectedIndex(0);
    }//GEN-LAST:event_Button_BorrarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField APELLIDOM;
    private javax.swing.JTextField APELLIDOP;
    private javax.swing.JTextField APEMA_B;
    private javax.swing.JTextField APEMA_M;
    private javax.swing.JTextField APEPA_B;
    private javax.swing.JTextField APEPA_M;
    private javax.swing.JButton Button_Borrar;
    private javax.swing.JButton Button_Buscar;
    private javax.swing.JButton Button_BuscarB;
    private javax.swing.JButton Button_MostrarTodo;
    private javax.swing.JButton Button_buscarM;
    private javax.swing.JButton Button_grabar;
    private javax.swing.JButton Button_grabarM;
    private javax.swing.JButton Button_limpiar;
    private javax.swing.JTextField EDAD;
    private javax.swing.JTextField EDADB;
    private javax.swing.JTextField EDADM;
    private javax.swing.JLabel FOTOB;
    private javax.swing.JLabel FOTOM;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField IDB;
    private javax.swing.JTextField IDM;
    private javax.swing.JPanel JpIngresar;
    private javax.swing.JPanel JpVisualizar;
    private javax.swing.JTextField NOMBRE;
    private javax.swing.JTextField NOMBREB;
    private javax.swing.JTextField NOMBREM;
    private javax.swing.JTextField SEXO;
    private javax.swing.JTextField SEXOB;
    private javax.swing.JTextField SEXOM;
    private javax.swing.JComboBox cbOpcion;
    private javax.swing.JComboBox cb_carrerasB;
    private javax.swing.JComboBox cb_carrerasM;
    private javax.swing.JComboBox comboCarrera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lblmsj;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtDato;
    // End of variables declaration//GEN-END:variables
}