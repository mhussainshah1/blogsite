## HTML Elements, Attributes and Whitespace

The main parts of our element are:

1. **The opening tag**: This consists of the name of the element (in this case, p), wrapped in opening and closing angle brackets. This states where the element begins or starts to take effect — in this case where the start of the paragraph is.
1. **The closing tag**: This is the same as the opening tag, except that it includes a forward slash before the element name. This states where the element ends — in this case where the end of the paragraph is. Failing to include a closing tag is a common beginner error and can lead to strange results.
1. **The content**: This is the content of the element, which in this case is just text.
1. **The element**: The opening tag plus the closing tag plus the content equals the element.

### Nesting elements
You can put elements inside other elements too — this is called **nesting**. If we wanted to state that our cat is **very** grumpy, we could wrap the word "very" in a `<strong>` (Links to an external site.)Links to an external site. element, which means that the word is to be strongly emphasized:

```
<p>My cat is <strong>very</strong> grumpy.</p>
```

You do however need to make sure that your elements are properly nested: in the example above, we opened the `p` element first, then the `strong` element, therefore we have to close the `strong` element first, then the `p`. The following is incorrect:

```
<p>My cat is <strong>very grumpy.</p></strong>
```

### Attributes [Section](https://developer.mozilla.org/en-US/docs/Learn/HTML/Introduction_to_HTML/Getting_started#Attributes)
Elements can also have attributes, which look like this:

<img src="/img/grumpy-cat-attribute-small.png" ,alt="attribute"">

Attributes contain extra information about the element which you don't want to appear in the actual content. In this case, the `class` attribute allows you to give the element an identifying name that can be later used to target the element with style information and other things.

An attribute should have:

1. A space between it and the element name (or the previous attribute, if the element already has one or more attributes.)
1. The attribute name, followed by an equals sign.
1. An attribute value, with opening and closing quote marks wrapped around it.Even numeric values should have quotes. It doesn't matter if you use single or double quotes - just be consistent.

### Whitespace in HTML
Whitespace is often included in html code. This is not necessary at all. The two following code snippets are equivalent:

```
<p>Dogs are silly.</p>

<p>Dogs        are
         silly.</p>
```
No matter how much whitespace you use (which can include space characters, but also line breaks), the HTML parser reduces each one down to a single space when rendering the code. So why use so much whitespace? The answer is readability — it is so much easier to understand what is going on in your code if you have it nicely formatted, and not just bunched up together in a big mess. 