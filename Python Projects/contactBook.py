import csv
import os
import sys
def create_csv():
    with open("contacts.csv", "w", newline="") as file:
        writer = csv.writer(file)
        writer.writerow(["Name", "Phone", "Email"])

def load_csv():
    with open("contacts.csv", newline="") as file:
        reader = csv.DictReader(file)
        contacts = []
        for row in reader:
            contacts.append(row)
        return contacts

def add_contact(name, phone, email):
    with open("contacts.csv", "a", newline="") as file:
        writer = csv.writer(file)
        writer.writerow([name, phone, email])

def search_contact(contacts, name):
    for contact in contacts:
        if contact["Name"] == name:
            return contact
    return None

def update_contact(contacts, name, phone, email):
    for contact in contacts:
        if contact["Name"] == name:
            contact["Phone"] = phone
            contact["Email"] = email
            return True
    return False

def delete_contact(contacts, name):
    for i, contact in enumerate(contacts):
        if contact["Name"] == name:
            del contacts[i]
            return True
    return False

def main():
    if not os.path.exists("contacts.csv"):
        create_csv()
    contacts = load_csv()
    while True:
        print("Contact Book")
        print("1. Add Contact")
        print("2. Search Contact")
        print("3. Update Contact")
        print("4. Delete Contact")
        print("5. Exit")
        choice = input("Enter your choice: ")
        if choice == "1":
            name = input("Enter name: ")
            phone = input("Enter phone: ")
            email = input("Enter email: ")
            add_contact(name, phone, email)
            print("Contact added successfully.")
        elif choice == "2":
            name = input("Enter name: ")
            contact = search_contact(contacts, name)
            if contact:
                print("Name: ", contact["Name"])
                print("Phone: ", contact["Phone"])
                print("Email: ", contact["Email"])
            else:
                print("Contact not found.")
        elif choice == "3":
            name = input("Enter name: ")
            phone = input("Enter new phone: ")
            email = input("Enter new email: ")
            if update_contact(contacts, name, phone, email):
                print("Contact updated successfully.")
            else:
                print("Contact not found.")
        elif choice == "4":
            name = input("Enter name: ")
            if delete_contact(contacts, name):
                print("Contact deleted successfully.")
            else:
                print("Contact not found.")
        elif choice == "5":
            sys.exit()
        else:
            print("Invalid choice. Please try again.")

if __name__ == "__main__":
    main()