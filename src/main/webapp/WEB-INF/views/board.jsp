<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>게시판</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 20px;
            background-color: #f4f4f4;
        }
        .container {
            max-width: 800px;
            margin: 0 auto;
            background: white;
            padding: 20px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        .post {
            border-bottom: 1px solid #ddd;
            padding: 10px 0;
        }
        .post:last-child {
            border-bottom: none;
        }
        .post-title {
            font-size: 20px;
            font-weight: bold;
        }
        .post-content {
            margin: 10px 0;
        }
        .new-post-form {
            margin: 20px 0;
        }
        .new-post-form input, .new-post-form textarea {
            width: 100%;
            padding: 10px;
            margin: 5px 0;
            box-sizing: border-box;
        }
        .new-post-form button {
            padding: 10px 20px;
            background-color: #007BFF;
            color: white;
            border: none;
            cursor: pointer;
        }
        .new-post-form button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>게시판</h1>
    <div id="posts">
        0000000000000
        ${board.contents}
    </div>
    <div class="new-post-form">
        <h2>새 게시물 작성</h2>
        <input type="text" id="title" placeholder="제목" required>
        <textarea id="content" rows="4" placeholder="내용" required></textarea>
        <button onclick="addPost()">게시물 추가</button>
    </div>
</div>