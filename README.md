# Capstone_Project_Peraturanku 

Readme untuk di Github:
Peraturanku is a mobile application that has information about UUD 1945, Undang-Undang, PP, Perpres, and Perda. We want to make this application because as mentioned before there is only a little information about UUD and the other rules in Indonesia. We want to provide the citizens of Indonesia this application so they have knowledge about some new rules or maybe the rules that already exist or not used anymore.

Because there is no integration between frontend, backend, and machine learning now. So we divide this application into 2 parts. The first part is the Android application developed by Mobile Development Team and Cloud Computing team. In this part, you can see a list of existing laws, information about it, and download links.
For the Android Application, you can run it by: 
> Get the code from 'src_code' branch. 

> Put the code to your Android Studio project directory.

> Open and run it with Android Studio.

Nb: For now, the frontend code and the backend code are able to combine although it's still not perfect in some aspect or feature (example: when clicking another menu, the homepage will be shown and cover the supposed UI for the page).

The second part is Machine Learning developed by Machine Learning team. In this part, you can use chatbot. 
There are two ways to run a chatbot:
1. Using CMD
> First, you need to have the prerequisites; in CMD you have to install python 3, TensorFlow, nltk, tensorflow.keras and to open it can use Visual Studio Code (recommended)
> Then open chatbot.py using CMD to start using the bot. The bot can reply to your greetings, saying thank you, answer your question, etc.  The bot don't need to be trained again because it had been trained. But if you want to see the results of the training data, you can open train.py in CMD.

2. Using Google Collaboratory
> First, open Google Collaboratory in your browser.
> Then, upload the notebook file Chatbot_Peraturanku.ipynb.
> Once open, before running it in Google Collaboratory you can enter the intents.json file manually or you can import it via your Google Drive by adjusting the location of the existing intents.json file.
