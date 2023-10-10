Differences between Java 8 Map() Vs flatMap() :

map()	
1. It processes stream of values.
2. It does only mapping.
3. It’s mapper function produces single value for each input value.
4. It is a One-To-One mapping.
5. Data Transformation : From Stream to Stream
6. Use this method when the mapper function is producing a single value for each input value.

flatMap()
1. It processes stream of stream of values.
2. It performs mapping as well as flattening.
3. It’s mapper function produces multiple values for each input value.
4. It is a One-To-Many mapping.
5. Data Transformation : From Stream<Stream to Stream
6. Use this method when the mapper function is producing multiple values for each input value.