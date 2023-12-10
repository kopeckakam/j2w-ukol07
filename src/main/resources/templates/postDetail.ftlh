[#ftl]

<h1>${singlePost.title?no_esc}</h1>
<div class="detail">
    <div class="singlePost">
        Autor: ${singlePost.author?no_esc}, dne: ${singlePost.published?date?string}<br>
        ${singlePost.body?no_esc!''}
    </div>
</div>