public class EventDemo extends JFrame {
    public EventDemo() {
        setTitle("Event Demo");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JLabel lblInfo = new JLabel("Press any key or click a button");
        JButton btnClick = new JButton("Click Me");
        JTextField txtField = new JTextField(20);
        setLayout(new FlowLayout());
        add(lblInfo);
        add(txtField);
        add(btnClick);
        btnClick.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lblInfo.setText("Button clicked!");
            }
        });
        btnClick.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                lblInfo.setText("Mouse entered button!");
            }
            public void mouseExited(MouseEvent e) {
                lblInfo.setText("Mouse exited button!");
            }
        });
        txtField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                lblInfo.setText("Key pressed: " + e.getKeyChar());
            }
        });
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                lblInfo.setText("Window is closing");
            }
        });
setVisible(true);
    }
    public static void main(String[] args) {
        new EventDemo();
    }
