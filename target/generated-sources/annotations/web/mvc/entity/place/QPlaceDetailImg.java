package web.mvc.entity.place;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPlaceDetailImg is a Querydsl query type for PlaceDetailImg
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPlaceDetailImg extends EntityPathBase<PlaceDetailImg> {

    private static final long serialVersionUID = 730459855L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPlaceDetailImg placeDetailImg = new QPlaceDetailImg("placeDetailImg");

    public final StringPath placeDetailImgName = createString("placeDetailImgName");

    public final NumberPath<Long> placeDetailImgSeq = createNumber("placeDetailImgSeq", Long.class);

    public final StringPath placeDetailImgSize = createString("placeDetailImgSize");

    public final StringPath placeDetailImgSrc = createString("placeDetailImgSrc");

    public final StringPath placeDetailImgType = createString("placeDetailImgType");

    public final QPlaceRecommendation placeRecommendation;

    public QPlaceDetailImg(String variable) {
        this(PlaceDetailImg.class, forVariable(variable), INITS);
    }

    public QPlaceDetailImg(Path<? extends PlaceDetailImg> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPlaceDetailImg(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPlaceDetailImg(PathMetadata metadata, PathInits inits) {
        this(PlaceDetailImg.class, metadata, inits);
    }

    public QPlaceDetailImg(Class<? extends PlaceDetailImg> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.placeRecommendation = inits.isInitialized("placeRecommendation") ? new QPlaceRecommendation(forProperty("placeRecommendation")) : null;
    }

}

