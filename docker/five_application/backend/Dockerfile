#This is a base image 

FROM node:14.18.1

WORKDIR /app

COPY package.json .

RUN npm install

# copy source destination
COPY . .

ENV PORT = 8000
ENV MONGO_USER = admin
ENV MONGO_PASSWORD = password

#ENV MONGO_INITDB_ROOT_USERNAME = ADMIN
#ENV MONGO_INITDB_ROOT_PASSWORD = PASSWORD


EXPOSE ${PORT}

CMD [ "node","index.js" ] 