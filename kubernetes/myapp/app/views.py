from django.shortcuts import render
from django.http import HttpResponse
# Create your views here.

'''
this will also run when uncommented

def index(request): 
	return HttpResponse("<h3>hello from the view.py....  h r u ?</h3>")
'''

'''
def index(request): 
	name = "Rishabh"
	return render(request , 'index.html' , context={'name' :name})
'''


def login(request): 
	return render(request , 'login.html')

def index(request): 
	username = request.POST['u_name']
	password = request.POST['u_password']

	if username=='rishabh' and password=="1234":
		msg = "login success"
	else:
		msg = "login failed ...  not an authentic user"

	return render(request , 'index.html' , context={'msg' :msg , 'name':username})