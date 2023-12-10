[#ftl]
[@c.page title="Seznam postu"]

    <h1>Seznam všech příspěvků</h1>
    <div class="posts">
        [#list posts.content as singlePost]
            Autor: ${singlePost.author?no_esc}, dne: ${singlePost.published?date?string}
            <table class="u-full-width">
                <thead>
                <tr>
                    <th>${singlePost.title?no_esc}</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>${singlePost.perex?no_esc}<a href="/detail/${singlePost.slug}">...</a></td>
                </tr>
                </tbody>
            </table>
        [#else]
            <div>Seznam je prázdný.</div>
        [/#list]
        [@c.totalCount /]


    </div>
    [@c.pager /]

[/@c.page]