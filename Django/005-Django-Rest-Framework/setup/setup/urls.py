from rest_framework import routers
from django.urls import path, include
from escola.views import AlunosViewSet, CursosViewSet
from django.contrib import admin

router = routers.DefaultRouter()
router.register('alunos', AlunosViewSet, basename='Alunos')
router.register('cursos', CursosViewSet, basename='Cursos')

urlpatterns = [
    path('admin/', admin.site.urls),
    path('', include(router.urls)),
]
