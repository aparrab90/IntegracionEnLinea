import pika
credentials = pika.PlainCredentials('admin', 'admin')
parameters = pika.ConnectionParameters(host='localhost',credentials=credentials)
connection = pika.BlockingConnection(parameters)
channel = connection.channel()
channel.queue_declare(queue='saludos')
channel.basic_publish(exchange='',routing_key='saludos',body="Hola Mundo")
connection.close()

