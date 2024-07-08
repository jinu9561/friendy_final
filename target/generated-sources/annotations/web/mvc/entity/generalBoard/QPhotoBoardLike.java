package web.mvc.entity.generalBoard;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPhotoBoardLike is a Querydsl query type for PhotoBoardLike
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPhotoBoardLike extends EntityPathBase<PhotoBoardLike> {

    private static final long serialVersionUID = 379207070L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPhotoBoardLike photoBoardLike = new QPhotoBoardLike("photoBoardLike");

    public final QPhotoBoard photoBoard;

    public final NumberPath<Long> photoBoardLikeSeq = createNumber("photoBoardLikeSeq", Long.class);

    public final web.mvc.entity.user.QUsers user;

    public QPhotoBoardLike(String variable) {
        this(PhotoBoardLike.class, forVariable(variable), INITS);
    }

    public QPhotoBoardLike(Path<? extends PhotoBoardLike> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPhotoBoardLike(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPhotoBoardLike(PathMetadata metadata, PathInits inits) {
        this(PhotoBoardLike.class, metadata, inits);
    }

    public QPhotoBoardLike(Class<? extends PhotoBoardLike> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.photoBoard = inits.isInitialized("photoBoard") ? new QPhotoBoard(forProperty("photoBoard"), inits.get("photoBoard")) : null;
        this.user = inits.isInitialized("user") ? new web.mvc.entity.user.QUsers(forProperty("user"), inits.get("user")) : null;
    }

}

