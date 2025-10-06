FROM python:alpine 
LABEL version="1.0"
WORKDIR /newrepo/python
COPY main.py /newrepo/python
CMD ["python", "main.py"]