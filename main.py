from http.server import HTTPServer, SimpleHTTPRequestHandler

PORT = 80

class Handler(SimpleHTTPRequestHandler):
    pass

print(f"Python server started on port {PORT}")
httpd = HTTPServer(("", PORT), Handler)
httpd.serve_forever()
