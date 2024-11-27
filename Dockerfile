FROM node:14

RUN mkdir -p /app

WORKDIR /app

COPY package*.json /app

RUN npm install

COPY . /app

RUN npm run build --prod

EXPOSE 4200

<<<<<<< HEAD
ENTRYPOINT ["npm", "start"]
=======
ENTRYPOINT ["npm", "start"]
>>>>>>> 4413fd984ee3ffc5af8df9528b6fa120b186b9e8
