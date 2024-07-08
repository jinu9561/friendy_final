package web.mvc.entity.report;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QReportType is a Querydsl query type for ReportType
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QReportType extends EntityPathBase<ReportType> {

    private static final long serialVersionUID = 442595915L;

    public static final QReportType reportType1 = new QReportType("reportType1");

    public final StringPath reportType = createString("reportType");

    public final NumberPath<Long> reportTypeSeq = createNumber("reportTypeSeq", Long.class);

    public final NumberPath<Long> seqByType = createNumber("seqByType", Long.class);

    public QReportType(String variable) {
        super(ReportType.class, forVariable(variable));
    }

    public QReportType(Path<? extends ReportType> path) {
        super(path.getType(), path.getMetadata());
    }

    public QReportType(PathMetadata metadata) {
        super(ReportType.class, metadata);
    }

}

