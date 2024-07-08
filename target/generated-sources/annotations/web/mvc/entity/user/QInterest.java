package web.mvc.entity.user;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QInterest is a Querydsl query type for Interest
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QInterest extends EntityPathBase<Interest> {

    private static final long serialVersionUID = -1023300048L;

    public static final QInterest interest = new QInterest("interest");

    public final StringPath interestCategory = createString("interestCategory");

    public final NumberPath<Long> interestSeq = createNumber("interestSeq", Long.class);

    public final ListPath<web.mvc.entity.generalBoard.PhotoBoardInterest, web.mvc.entity.generalBoard.QPhotoBoardInterest> photoBoardInterestList = this.<web.mvc.entity.generalBoard.PhotoBoardInterest, web.mvc.entity.generalBoard.QPhotoBoardInterest>createList("photoBoardInterestList", web.mvc.entity.generalBoard.PhotoBoardInterest.class, web.mvc.entity.generalBoard.QPhotoBoardInterest.class, PathInits.DIRECT2);

    public final ListPath<ProfileInterest, QProfileInterest> profileInterestList = this.<ProfileInterest, QProfileInterest>createList("profileInterestList", ProfileInterest.class, QProfileInterest.class, PathInits.DIRECT2);

    public QInterest(String variable) {
        super(Interest.class, forVariable(variable));
    }

    public QInterest(Path<? extends Interest> path) {
        super(path.getType(), path.getMetadata());
    }

    public QInterest(PathMetadata metadata) {
        super(Interest.class, metadata);
    }

}

