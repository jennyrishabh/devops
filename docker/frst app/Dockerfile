#This is a base image 

FROM node:14.18.1

WORKDIR /app

COPY package.json . 

RUN npm install

# copy source destination
COPY . .

EXPOSE 3000

CMD [ "node","index.js" ] 