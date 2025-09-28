
package bank.mangement.system2;

import java.awt.*;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;


public class SignUpOne extends JFrame {
    JLabel formo,personalDetail,name,fatherName,dOB,gender,email,marital,address,city,pin,state;
    JButton next,dobButton;
    JTextField nameField,fatherNameField,emailField,addressField,cityField,pinField,stateField;
    JTextField dobField;
    JRadioButton male,female,married,single;
    ButtonGroup genderGroup,maritalGroup;
    SignUpOne(){
    Random ran =new Random();
    
        formo=new JLabel("APPLICATION FORM NO. "+Math.abs((ran.nextLong()%9000L)+1000L));
        formo .setFont(new Font("Raleway",Font.BOLD,38));
        formo.setBounds(140,20,600,40);
        add(formo);
        
        personalDetail=new JLabel("Page 1:Personal Details");
        personalDetail .setFont(new Font("Raleway",Font.BOLD,22));
        personalDetail.setBounds(260,80,600,40);
        add(personalDetail);
        
        name=new JLabel("Name:");
        name .setFont(new Font("Raleway",Font.BOLD,18));
        name.setBounds(100,140,300,30);
        add(name);
        
        nameField=new JTextField("");
                nameField.setFont(new Font("Raleway",Font.BOLD,18));

         nameField.setBounds(300,140,400,30);
        add(nameField);
        
        fatherName=new JLabel("Father Name:");
        fatherName .setFont(new Font("Raleway",Font.BOLD,18));
        fatherName.setBounds(100,180,300,30);
        add(fatherName);
        
        fatherNameField=new JTextField("");      
        fatherNameField .setFont(new Font("Raleway",Font.BOLD,18));

         fatherNameField.setBounds(300,180,400,30);
        add(fatherNameField);
        

        
        dOB=new JLabel("DOB:");
        dOB .setFont(new Font("Raleway",Font.BOLD,18));
        dOB.setBounds(100,220,300,30);
        add(dOB);
        
        dobField=new JTextField("");
        dobField.setFont(new Font("Raleway",Font.BOLD,18));
        dobField.setBounds(300,220,300,30);
        dobField.setEditable(false);
        add(dobField);
        
        dobButton=new JButton("📅");
        dobButton.setFont(new Font("Arial",Font.BOLD,16));
        dobButton.setBounds(610,220,40,30);
        dobButton.setBackground(Color.LIGHT_GRAY);
        dobButton.addActionListener(e -> showCalendarDialog());
        add(dobButton);

        

         gender=new JLabel("Gender:");
        gender .setFont(new Font("Raleway",Font.BOLD,18));
        gender.setBounds(100,260,300,30);
        add(gender);
        
        male=new JRadioButton("Male");
        male.setFont(new Font("Raleway",Font.BOLD,16));
        male.setBounds(300,260,100,30);
        male.setBackground(Color.WHITE);
        add(male);
        
        female=new JRadioButton("Female");
        female.setFont(new Font("Raleway",Font.BOLD,16));
        female.setBounds(450,260,100,30);
        female.setBackground(Color.WHITE);
        add(female);
        
        genderGroup=new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        

         email=new JLabel("Email :");
        email .setFont(new Font("Raleway",Font.BOLD,18));
        email.setBounds(100,300,300,30);
        add(email);
        
emailField=new JTextField("");
        emailField .setFont(new Font("Raleway",Font.BOLD,18));

         emailField.setBounds(300,300,400,30);
        add(emailField);
        
         marital=new JLabel("Marital Status:");
        marital .setFont(new Font("Raleway",Font.BOLD,18));
        marital.setBounds(100,340,300,30);
        add(marital);
        
        married=new JRadioButton("Married");
        married.setFont(new Font("Raleway",Font.BOLD,16));
        married.setBounds(300,340,100,30);
        married.setBackground(Color.WHITE);
        add(married);
        
        single=new JRadioButton("Single");
        single.setFont(new Font("Raleway",Font.BOLD,16));
        single.setBounds(450,340,100,30);
        single.setBackground(Color.WHITE);
        add(single);
        
        maritalGroup=new ButtonGroup();
        maritalGroup.add(married);
        maritalGroup.add(single);
        
        
        address=new JLabel("Address:");
        address .setFont(new Font("Raleway",Font.BOLD,18));
        address.setBounds(100,380,300,30);
        add(address);
        
        addressField=new JTextField("");
        addressField .setFont(new Font("Raleway",Font.BOLD,18));
         addressField.setBounds(300,380,400,30);
        add(addressField);
        
        city=new JLabel("City:");
        city .setFont(new Font("Raleway",Font.BOLD,18));
        city.setBounds(100,420,300,30);
        add(city);
        
        cityField=new JTextField("");
                cityField .setFont(new Font("Raleway",Font.BOLD,18));
         cityField.setBounds(300,420,400,30);
        add(cityField);
        
        pin=new JLabel("Pin Code:");
        pin .setFont(new Font("Raleway",Font.BOLD,18));
        pin.setBounds(100,460,300,30);
        add(pin);
        
        pinField=new JTextField("");        
        pinField .setFont(new Font("Raleway",Font.BOLD,18));

         pinField.setBounds(300,460,400,30);
        add(pinField);
        
        state=new JLabel("State:");
        state .setFont(new Font("Raleway",Font.BOLD,18));
        state.setBounds(100,500,300,30);
        add(state);
        
        stateField=new JTextField("");      
        stateField .setFont(new Font("Raleway",Font.BOLD,18));

         stateField.setBounds(300,500,400,30);
        add(stateField);
        
        next =new JButton("NEXT");
        next.setBounds(620,550,80,40);
        add(next);
        
        
        
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(850,800);
        setVisible(true);
                
         
    }
//    calender 
    private void showCalendarDialog() {
        JDialog dialog = new JDialog(this, "Select Date of Birth", true);
        dialog.setSize(350, 300);
        dialog.setLocationRelativeTo(this);
        dialog.setLayout(new BorderLayout());
        
        // Current date
        Calendar cal = Calendar.getInstance();
        int currentYear = cal.get(Calendar.YEAR);
        int currentMonth = cal.get(Calendar.MONTH);
        
        // Month and Year selection
        JPanel topPanel = new JPanel(new FlowLayout());
        JComboBox<String> monthBox = new JComboBox<>(new String[]{
            "Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
        });
        monthBox.setSelectedIndex(currentMonth);
        
        JComboBox<Integer> yearBox = new JComboBox<>();
        for (int year = 1950; year <= currentYear; year++) {
            yearBox.addItem(year);
        }
        yearBox.setSelectedItem(currentYear);
        
        topPanel.add(monthBox);
        topPanel.add(yearBox);
        
        // Calendar grid
        JPanel calendarPanel = new JPanel(new GridLayout(7, 7, 1, 1));
        calendarPanel.setBackground(Color.WHITE);
        
        // Day headers
        String[] dayNames = {"S", "M", "T", "W", "T", "F", "S"};
        for (String day : dayNames) {
            JLabel header = new JLabel(day, JLabel.CENTER);
            header.setBackground(Color.LIGHT_GRAY);
            header.setOpaque(true);
            header.setFont(new Font("Arial", Font.BOLD, 12));
            calendarPanel.add(header);
        }
        
        // Create calendar buttons
        JButton[][] buttons = new JButton[6][7];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].setFont(new Font("Arial", Font.PLAIN, 11));
                buttons[i][j].setBackground(Color.WHITE);
                calendarPanel.add(buttons[i][j]);
            }
        }
        
        // Update calendar when month/year changes
        ActionListener updateListener = e -> updateCalendarGrid(buttons, monthBox.getSelectedIndex(), (Integer)yearBox.getSelectedItem());
        monthBox.addActionListener(updateListener);
        yearBox.addActionListener(updateListener);
        
        // Initial calendar update
        updateCalendarGrid(buttons, currentMonth, currentYear);
        
        // Bottom buttons
        JPanel bottomPanel = new JPanel(new FlowLayout());
        JButton cancelBtn = new JButton("Cancel");
        cancelBtn.addActionListener(e -> dialog.dispose());
        bottomPanel.add(cancelBtn);
        
        dialog.add(topPanel, BorderLayout.NORTH);
        dialog.add(calendarPanel, BorderLayout.CENTER);
        dialog.add(bottomPanel, BorderLayout.SOUTH);
        
        dialog.setVisible(true);
    }
    
    
    private void updateCalendarGrid(JButton[][] buttons, int month, int year) {
        // Clear all buttons
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                buttons[i][j].setText("");
                buttons[i][j].setEnabled(false);
                buttons[i][j].setBackground(Color.WHITE);
            }
        }
        
        // Set up calendar for the month/year
        Calendar cal = Calendar.getInstance();
        cal.set(year, month, 1);
        
        int firstDayOfWeek = cal.get(Calendar.DAY_OF_WEEK) - 1; // 0 = Sunday
        int daysInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        
        int day = 1;
        
        // Fill in the days
        for (int i = 0; i < 6 && day <= daysInMonth; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 0 && j < firstDayOfWeek) {
                    // Empty cells before first day - do nothing
                } else if (day <= daysInMonth) {
                    buttons[i][j].setText(String.valueOf(day));
                    buttons[i][j].setEnabled(true);
                    
                    final int selectedDay = day;
                    final int finalMonth = month;
                    final int finalYear = year;
                    final int finalI = i;
                    final int finalJ = j;
                    
                    buttons[i][j].addActionListener(e -> {
                        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                        Calendar selectedCal = Calendar.getInstance();
                        selectedCal.set(finalYear, finalMonth, selectedDay);
                        dobField.setText(sdf.format(selectedCal.getTime()));
                        ((JDialog)buttons[finalI][finalJ].getTopLevelAncestor()).dispose();
                    });
                    
                    day++;
                }
            }
        }
    }
    
    public static void main(String args[]){
        new SignUpOne();
    }
            
}

