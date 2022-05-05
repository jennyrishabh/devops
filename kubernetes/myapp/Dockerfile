FROM python:3.9

ENV PYTHONUNBUFFERED 1
ADD . /myapp
WORKDIR /myapp
COPY requirements.txt /app/requirements.txt

RUN pip install -r requirements.txt

COPY . /myapp

# EXPOSE 8000

# CMD python manage.py runserver