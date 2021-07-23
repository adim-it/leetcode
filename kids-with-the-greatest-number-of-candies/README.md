<h2>1431. Kids With the Greatest Number of Candies</h2><h3>Easy</h3><hr><div><p><font papago-id="16" papago-translate="translated">There are </font><code>n</code><font papago-id="17" papago-translate="translated"> kids with candies. You are given an integer array </font><code>candies</code><font papago-id="18" papago-translate="translated">, where each </font><code>candies[i]</code><font papago-id="19" papago-translate="translated"> represents the number of candies the </font><code>i<sup>th</sup></code><font papago-id="20" papago-translate="translated"> kid has, and an integer </font><code>extraCandies</code><font papago-id="21" papago-translate="translated">, denoting the number of extra candies that you have.</font></p>

<p><code>result</code><font papago-translate="splited"><em papago-id="22" papago-translate="translated"> of length </em></font><code>n</code><font papago-translate="splited"><em papago-id="23" papago-translate="translated">, where </em></font><code>result[i]</code><font papago-translate="splited"><em papago-id="24" papago-translate="translated"> is </em></font><code>true</code><font papago-translate="splited"><em papago-id="25" papago-translate="translated"> if, after giving the </em></font><code>i<sup>th</sup></code><font papago-translate="splited"><em papago-id="26" papago-translate="translated"> kid all the </em></font><code>extraCandies</code><font papago-translate="splited"><em papago-id="27" papago-translate="translated">, or </em></font><code>false</code></p>

<p papago-id="28" papago-translate="cached">Note that <strong papago-id="29">multiple</strong> kids can have the <strong papago-id="31">greatest</strong> number of candies.</p>

<p>&nbsp;</p>
<p><strong papago-id="29" papago-translate="translated">Example 1:</strong></p>

<pre papago-id="30" papago-translate="cached"><strong papago-id="30">Input:</strong> candies = [2,3,5,1,3], extraCandies = 3
<strong papago-id="32">Output:</strong> [true,true,true,false,true] 
<strong papago-id="34">Explanation:</strong> If you give all extraCandies to:
- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
</pre>

<p><strong papago-id="31" papago-translate="translated">Example 2:</strong></p>

<pre papago-id="32" papago-translate="cached"><strong papago-id="32">Input:</strong> candies = [4,2,1,1,2], extraCandies = 1
<strong papago-id="34">Output:</strong> [true,false,false,false,false] 
<strong papago-id="36">Explanation:</strong> There is only 1 extra candy.
Kid 1 will always have the greatest number of candies, even if a different kid is given the extra candy.
</pre>

<p><strong>Example 3:</strong></p>

<pre><strong>Input:</strong> candies = [12,1,12], extraCandies = 10
<strong>Output:</strong> [true,false,true]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>n == candies.length</code></li>
	<li><code>2 &lt;= n &lt;= 100</code></li>
	<li><code>1 &lt;= candies[i] &lt;= 100</code></li>
	<li><code>1 &lt;= extraCandies &lt;= 50</code></li>
</ul>
</div>