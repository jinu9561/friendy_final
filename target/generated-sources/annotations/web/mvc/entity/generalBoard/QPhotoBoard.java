package web.mvc.entity.generalBoard;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPhotoBoard is a Querydsl query type for PhotoBoard
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPhotoBoard extends EntityPathBase<PhotoBoard> {

    private static final long serialVersionUID = -2115689113L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPhotoBoard photoBoard = new QPhotoBoard("photoBoard");

    public final ListPath<PhotoBoardDetailImg, QPhotoBoardDetailImg> photoBoardDetailImgList = this.<PhotoBoardDetailImg, QPhotoBoardDetailImg>createList("photoBoardDetailImgList", PhotoBoardDetailImg.class, QPhotoBoardDetailImg.class, PathInits.DIRECT2);

    public final ListPath<PhotoBoardInterest, QPhotoBoardInterest> photoBoardInterestList = this.<PhotoBoardInterest, QPhotoBoardInterest>createList("photoBoardInterestList", PhotoBoardInterest.class, QPhotoBoardInterest.class, PathInits.DIRECT2);

    public final NumberPath<Integer> photoBoardLike = createNumber("photoBoardLike", Integer.class);

    public final ListPath<PhotoBoardLike, QPhotoBoardLike> photoBoardLikeList = this.<PhotoBoardLike, QPhotoBoardLike>createList("photoBoardLikeList", PhotoBoardLike.class, QPhotoBoardLike.class, PathInits.DIRECT2);

    public final DateTimePath<java.time.LocalDateTime> photoBoardRegDate = createDateTime("photoBoardRegDate", java.time.LocalDateTime.class);

    public final NumberPath<Long> photoBoardSeq = createNumber("photoBoardSeq", Long.class);

    public final StringPath photoBoardTitle = createString("photoBoardTitle");

    public final DateTimePath<java.time.LocalDateTime> photoBoardUpdateDate = createDateTime("photoBoardUpdateDate", java.time.LocalDateTime.class);

    public final StringPath photoMainImgName = createString("photoMainImgName");

    public final StringPath photoMainImgSize = createString("photoMainImgSize");

    public final StringPath photoMainImgSrc = createString("photoMainImgSrc");

    public final StringPath photoMainImgType = createString("photoMainImgType");

    public final web.mvc.entity.user.QUsers user;

    public QPhotoBoard(String variable) {
        this(PhotoBoard.class, forVariable(variable), INITS);
    }

    public QPhotoBoard(Path<? extends PhotoBoard> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPhotoBoard(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPhotoBoard(PathMetadata metadata, PathInits inits) {
        this(PhotoBoard.class, metadata, inits);
    }

    public QPhotoBoard(Class<? extends PhotoBoard> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.user = inits.isInitialized("user") ? new web.mvc.entity.user.QUsers(forProperty("user"), inits.get("user")) : null;
    }

}

