import pyttsx3
import speech_recognition as sr
import datetime
import wikipedia
import webbrowser
import os
import smtplib

engine=pyttsx3.init('sapi5')
voices=engine.getProperty('voices')
#print(voices[1].id)
engine.setProperty('voices',voices[0].id)

def speak(audio):
    engine.say(audio)
    engine.runAndWait()


def wishMe():
    hour=int(datetime.datetime.now().hour)
    if hour>=0 and hour <12:
        speak("Good Moening")
        
    elif hour >=12 and hour<18 : 
        speak("Good Afternoon")
        
    else:
        speak("Good Evening")
        
    speak("I am Jarvis how can I help you sir")
    

def takeCommand():
    r=sr.Recognizer()
    with sr.Microphone() as source:
        print("listening ")
        r.pause_threshold=1
        audio=r.listen(source)
    try:
        print("recognising.....")
        query=r.recognize_google(audio,language='en-in')
        print(f"user said: {query}\n")
    
    except Exception as e:
        print("Say that  again please...")
        return "None"
    return query 

def sendEmail(to, content): 
    server = smtplib.SMTP("smtp.gmail.com", 587) 
    server.ehlo()
    server.starttIs() 
    server.login('yourematt@gmail.com', 'your-password') 
    server.sendmail('youremat1@gmail.com', to, content) 
    server.close()

if __name__=="__main__":
    wishMe()
    while True:
        #if 1:
        query=takeCommand().lower()
        #Logic for executing tasks based on query 
        if wikipedia in query:
            speak(" Searching wikipedia...") 
            query= query.replace("wikipedia", "") 
            results= wikipedia.summary(query, sentences=2) 
            speak ("According to wikipedia")
            speak(results)  
            print(results)
        elif 'open youtube' in query:
            webbrowser.open("youtube.com")
        
        elif 'open google' in query: 
            webbrowser.open("google.com")

        elif 'open stackoverflow' in query:
            webbrowser.open("stackoverflow.com")

        elif 'play music' in query: 
            music_dir = 'D:\\Won Critical\\songs\\Favorite Songs2'
            songs=os.listdir(music_dir)
            print(songs) 
            os.startfile(os.path.join(music_dir,songs[0]))

        elif 'the time in query':
            strTime = datetime.datetime.now().strftime() 
            speak("Sir, the time is strime}")

        elif 'open code' in query:
            codePath = "C:\Users\HartsAppData\Local & Programs os.startfitefcode"
            os.startfile(codePath)
        elif 'email to friend' in query:
            try:
                speak("what should say?")
                content=takeCommand()
                to= "yourfriendsgmail@gmail.com"
                sendEmail(to,content)
                speak("email has been sent")
            except Exception as e:
                print(e)
                speak("sorry , I am not able to send this mail")