package web.mvc.entity.generalBoard;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPhotoBoardDetailImg is a Querydsl query type for PhotoBoardDetailImg
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPhotoBoardDetailImg extends EntityPathBase<PhotoBoardDetailImg> {

    private static final long serialVersionUID = -1200097269L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPhotoBoardDetailImg photoBoardDetailImg = new QPhotoBoardDetailImg("photoBoardDetailImg");

    public final QPhotoBoard photoBoard;

    public final StringPath photoDetailImgName = createString("photoDetailImgName");

    public final NumberPath<Long> photoDetailImgSeq = createNumber("photoDetailImgSeq", Long.class);

    public final StringPath photoDetailImgSize = createString("photoDetailImgSize");

    public final StringPath photoDetailImgSrc = createString("photoDetailImgSrc");

    public final StringPath photoDetailImgType = createString("photoDetailImgType");

    public QPhotoBoardDetailImg(String variable) {
        this(PhotoBoardDetailImg.class, forVariable(variable), INITS);
    }

    public QPhotoBoardDetailImg(Path<? extends PhotoBoardDetailImg> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPhotoBoardDetailImg(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPhotoBoardDetailImg(PathMetadata metadata, PathInits inits) {
        this(PhotoBoardDetailImg.class, metadata, inits);
    }

    public QPhotoBoardDetailImg(Class<? extends PhotoBoardDetailImg> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.photoBoard = inits.isInitialized("photoBoard") ? new QPhotoBoard(forProperty("photoBoard"), inits.get("photoBoard")) : null;
    }

}

