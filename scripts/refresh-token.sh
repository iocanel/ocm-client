#!/bin/bash

TOKEN_URL="https://sso.redhat.com/auth/realms/redhat-external/protocol/openid-connect/token"

curl \
--request POST \
--data 'client_id=cloud-services&refresh_token=eyJhbGciOiJIUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJhZDUyMjdhMy1iY2ZkLTRjZjAtYTdiNi0zOTk4MzVhMDg1NjYifQ.eyJpYXQiOjE2MDU4ODI4MTQsImp0aSI6IjEyZDJmOTlkLWZmMGItNGJhNy1hNzkyLWY2NjhiOTAyMDUyYiIsImlzcyI6Imh0dHBzOi8vc3NvLnJlZGhhdC5jb20vYXV0aC9yZWFsbXMvcmVkaGF0LWV4dGVybmFsIiwiYXVkIjoiaHR0cHM6Ly9zc28ucmVkaGF0LmNvbS9hdXRoL3JlYWxtcy9yZWRoYXQtZXh0ZXJuYWwiLCJzdWIiOiJmOjUyOGQ3NmZmLWY3MDgtNDNlZC04Y2Q1LWZlMTZmNGZlMGNlNjppb2NhbmVsQGdtYWlsLmNvbSIsInR5cCI6Ik9mZmxpbmUiLCJhenAiOiJjbG91ZC1zZXJ2aWNlcyIsIm5vbmNlIjoiNzM3Y2VmNjYtMmNiYy00YzA2LWJjMTctNDI0MGU4OTU5YzlmIiwic2Vzc2lvbl9zdGF0ZSI6IjQ0ODM0OGIyLThkZTktNGY3My04MjNmLTM5YWQwMTFkMzA1OSIsInNjb3BlIjoib3BlbmlkIG9mZmxpbmVfYWNjZXNzIn0.SvUw2IyDVgHiitgAeinLxqnq37OrWWy7wRDEGdWqcHk&grant_type=refresh_token' \
$TOKEN_URL

#
# Sample request
# {
#   "args": {}, 
#   "data": "", 
#   "files": {}, 
#   "form": {
#     "client_id": "cloud-services", 
#     "grant_type": "refresh_token", 
#     "refresh_token": "eyJhbGciOiJIUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJhZDUyMjdhMy1iY2ZkLTRjZjAtYTdiNi0zOTk4MzVhMDg1NjYifQ.eyJpYXQiOjE2MDU4ODI4MTQsImp0aSI6IjEyZDJmOTlkLWZmMGItNGJhNy1hNzkyLWY2NjhiOTAyMDUyYiIsImlzcyI6Imh0dHBzOi8vc3NvLnJlZGhhdC5jb20vYXV0aC9yZWFsbXMvcmVkaGF0LWV4dGVybmFsIiwiYXVkIjoiaHR0cHM6Ly9zc28ucmVkaGF0LmNvbS9hdXRoL3JlYWxtcy9yZWRoYXQtZXh0ZXJuYWwiLCJzdWIiOiJmOjUyOGQ3NmZmLWY3MDgtNDNlZC04Y2Q1LWZlMTZmNGZlMGNlNjppb2NhbmVsQGdtYWlsLmNvbSIsInR5cCI6Ik9mZmxpbmUiLCJhenAiOiJjbG91ZC1zZXJ2aWNlcyIsIm5vbmNlIjoiNzM3Y2VmNjYtMmNiYy00YzA2LWJjMTctNDI0MGU4OTU5YzlmIiwic2Vzc2lvbl9zdGF0ZSI6IjQ0ODM0OGIyLThkZTktNGY3My04MjNmLTM5YWQwMTFkMzA1OSIsInNjb3BlIjoib3BlbmlkIG9mZmxpbmVfYWNjZXNzIn0.SvUw2IyDVgHiitgAeinLxqnq37OrWWy7wRDEGdWqcHk"
#   }, 
#   "headers": {
#     "Accept": "*/*", 
#     "Content-Length": "770", 
#     "Content-Type": "application/x-www-form-urlencoded", 
#     "Host": "https://sso.redhat.com/auth/realms/redhat-external/protocol/openid-connect/token", 
#     "User-Agent": "curl/7.73.0", 
#     "X-Amzn-Trace-Id": "Root=1-5fb822e7-02ec64d550f3803c0e9be08d"
#   }, 
#   "json": null, 
#   "origin": "94.66.225.2", 
#   "url": "https://httpbin.org/post"
# }
