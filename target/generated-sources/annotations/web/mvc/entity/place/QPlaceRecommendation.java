package web.mvc.entity.place;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPlaceRecommendation is a Querydsl query type for PlaceRecommendation
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPlaceRecommendation extends EntityPathBase<PlaceRecommendation> {

    private static final long serialVersionUID = 401396924L;

    public static final QPlaceRecommendation placeRecommendation = new QPlaceRecommendation("placeRecommendation");

    public final StringPath placeAddress = createString("placeAddress");

    public final StringPath placeDescription = createString("placeDescription");

    public final ListPath<PlaceDetailImg, QPlaceDetailImg> placeDetailImgList = this.<PlaceDetailImg, QPlaceDetailImg>createList("placeDetailImgList", PlaceDetailImg.class, QPlaceDetailImg.class, PathInits.DIRECT2);

    public final StringPath placeMainImg = createString("placeMainImg");

    public final StringPath placeMainImgName = createString("placeMainImgName");

    public final StringPath placeMainImgSize = createString("placeMainImgSize");

    public final StringPath placeMainImgType = createString("placeMainImgType");

    public final StringPath placeName = createString("placeName");

    public final DateTimePath<java.time.LocalDateTime> placeRegDate = createDateTime("placeRegDate", java.time.LocalDateTime.class);

    public final NumberPath<Long> placeSeq = createNumber("placeSeq", Long.class);

    public final DateTimePath<java.time.LocalDateTime> placeUpdateDate = createDateTime("placeUpdateDate", java.time.LocalDateTime.class);

    public QPlaceRecommendation(String variable) {
        super(PlaceRecommendation.class, forVariable(variable));
    }

    public QPlaceRecommendation(Path<? extends PlaceRecommendation> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPlaceRecommendation(PathMetadata metadata) {
        super(PlaceRecommendation.class, metadata);
    }

}

