package web.mvc.entity.generalBoard;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPhotoBoardInterest is a Querydsl query type for PhotoBoardInterest
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPhotoBoardInterest extends EntityPathBase<PhotoBoardInterest> {

    private static final long serialVersionUID = 2119358897L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPhotoBoardInterest photoBoardInterest = new QPhotoBoardInterest("photoBoardInterest");

    public final web.mvc.entity.user.QInterest interest;

    public final QPhotoBoard photoBoard;

    public final NumberPath<Long> PhotoBoardInterestSeq = createNumber("PhotoBoardInterestSeq", Long.class);

    public QPhotoBoardInterest(String variable) {
        this(PhotoBoardInterest.class, forVariable(variable), INITS);
    }

    public QPhotoBoardInterest(Path<? extends PhotoBoardInterest> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPhotoBoardInterest(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPhotoBoardInterest(PathMetadata metadata, PathInits inits) {
        this(PhotoBoardInterest.class, metadata, inits);
    }

    public QPhotoBoardInterest(Class<? extends PhotoBoardInterest> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.interest = inits.isInitialized("interest") ? new web.mvc.entity.user.QInterest(forProperty("interest")) : null;
        this.photoBoard = inits.isInitialized("photoBoard") ? new QPhotoBoard(forProperty("photoBoard"), inits.get("photoBoard")) : null;
    }

}

