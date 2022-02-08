package com.mycompany.netbeansproject1.program;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Start {

	private List<MobilePhone> mobilePhones;
	private Scanner entry;
	private MobilePhone mobilePhone;

	public Start() {

		mobilePhones = new ArrayList<>();
		entry = new Scanner(System.in);
                startingData();
		program();
		entry.close();
	}

        private void startingData(){
            for (int i=0;i<10;i++){
                mobilePhones.add(new MobilePhone(i + 1, "M" + (i + 1), new BigDecimal(i * 1000)));
            }
        }
        
	private void program() {
		title();
		menu();

	}

	private void menu() {
		System.out.println("\n1. Add mobile phone");
		System.out.println("2. Change mobile phone");
		System.out.println("3. Delete mobile phone");
		System.out.println("4. Read mobile phone");
		System.out.println("5. Exit program");
                System.out.println("6. Save on disc");

		switch (Entry.enterInt(entry, "Choose action:")) {
		case 1: {
			entry();
			break;
		}
		case 2: {
			change();
			break;
		}
		case 3: {
			delete();
			break;
		}
		case 4: {
			read();
			menu();
			break;
		}
		case 5: {
			System.out.println("Thank you for using our program, goodbye!");
			break;
		}
                case 6: {
                    saveOnDisc();
                    break;
                }
		default:
			System.out.println("Invalid action");
			menu();
		}
	}

	private void read() {

		int b = 1;

		for (MobilePhone m : mobilePhones) {
			System.out.println(b++ + ". " + m);
		}
	}

	private void delete() {
		read();
		mobilePhones.remove(Entry.enterInt(entry, "Enter number of which mobile phone you want to delete")-1);
		menu();
	}

	private void change() {
		read();
		int i = Entry.enterInt(entry, "Enter number of which mobile phone you want to change");
		mobilePhone = mobilePhones.get(i - 1);
		mobilePhone.setId(Entry.enterInt(entry, "Change id (" + mobilePhone.getId() + ")"));
		mobilePhone.setName(Entry.enterString(entry, "Change title (" + mobilePhone.getName() + ")"));
		mobilePhone.setPrice(Entry.enterBigDecimal(entry, "Change price (" + mobilePhone.getPrice() + ")"));
		menu();
	}

	private void entry() {

		mobilePhone = new MobilePhone();

		mobilePhone.setId(Entry.enterInt(entry, "Enter mobile phone id"));
		mobilePhone.setName(Entry.enterString(entry, "Enter mobile phone title"));
		mobilePhone.setPrice(Entry.enterBigDecimal(entry, "Enter mobile phone price"));
		mobilePhones.add(mobilePhone);
		menu();
	}

	private void title() {
		System.out.println("******************************");
		System.out.println("***Program Mobile Phones v1***");
		System.out.println("******************************");

	}

	public static void main(String[] args) {
		new Start();
	}

    private void saveOnDisc() {
            try {
               Gson gson = new GsonBuilder().setPrettyPrinting().create();
                
                System.out.println("Number of mobile phones: " + mobilePhones.size());
                
                FileWriter writer = new FileWriter(new File("data.json"));
                gson.toJson(mobilePhones,writer);
                writer.flush();
                writer.close();
                
            } catch (IOException ex) {
                ex.printStackTrace();
            }
    }
}
