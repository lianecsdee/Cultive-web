from django.db import models import User


class Usuario(models.Model):
    username = models.CharField(max_length=100)
    senha = models.CharField(max_length=50) #ISSO É ALTAMENTE INSEGURO E NÃO É A VERSÃO FINAL!