<!DOCTYPE html>
<nav class="navbar navbar-default navbar-static-top" role="navigation">
   <div class="container-fluid">

       <!-- Brand and toggle get grouped for better mobile display -->
       <div class="navbar-header">
            <!-- This makes the button for collapsed navbar -->
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-collapse-1">
               <span class="sr-only">Toggle navigation</span>
               <span class="icon-bar"></span>
               <span class="icon-bar"></span>
               <span class="icon-bar"></span>
            </button>
            <!--<a href="/${grails.util.Metadata.current.getApplicationName()}">-->
            <li><a href="#">Books</a></li>
                <div class="navbar-brand title-name">Book Store</div>
            </a>
       </div><!-- /.navbar-header -->

       <!-- Collect the nav links, forms, and other content for toggling -->
       <div class="collapse navbar-collapse" id="navbar-collapse-1">
            <ul class="nav navbar-nav navbar-right">
                  <li><a href="#">Books</a></li>
                  <li><a href="#">Authors</a></li>
                  <li><g:link controller="Books">Books</g:link></li>
                  <li><g:link controller="Authors">Authors</g:link></li>
            </ul>
       </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>