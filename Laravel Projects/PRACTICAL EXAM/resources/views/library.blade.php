<!-- resources/views/library.blade.php -->

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Library</title>
</head>
<body>
    <h1>Library</h1>

    <!-- Search Form -->
    <form action="{{ route('books.search') }}" method="GET">
        <input type="text" name="query" placeholder="Search by title">
        <button type="submit">Search</button>
    </form>

    <!-- Book List -->
    <table>
        <!-- Table headers -->
        <thead>
            <tr>
                <th>Title</th>
                <th>Author</th>
                <th>ISBN</th>
                <th>Publication Year</th>
                <th>Available</th>
            </tr>
        </thead>
        <!-- Table body -->
        <tbody>
            @foreach($books as $book)
                <tr>
                    <td>{{ $book->title }}</td>
                    <td>{{ $book->author_id }}</td>
                    <td>{{ $book->ISBN }}</td>
                    <td>{{ $book->pub_year }}</td>
                    <td>{{ $book->available ? 'Yes' : 'No' }}</td>
                </tr>
            @endforeach
        </tbody>
    </table>
</body>
</html>
