/*
 * generated by Xtext 2.25.0
 */
package l3IAProjectHTML.serializer;

import com.google.inject.Inject;
import fRUnivCoteAzurL3IAProjectHTML.FRUnivCoteAzurL3IAProjectHTMLPackage;
import fRUnivCoteAzurL3IAProjectHTML.FileLoader;
import fRUnivCoteAzurL3IAProjectHTML.Filter;
import fRUnivCoteAzurL3IAProjectHTML.Graph;
import fRUnivCoteAzurL3IAProjectHTML.Program;
import java.util.Set;
import l3IAProjectHTML.services.MyDslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == FRUnivCoteAzurL3IAProjectHTMLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case FRUnivCoteAzurL3IAProjectHTMLPackage.FILE_LOADER:
				sequence_FileLoader(context, (FileLoader) semanticObject); 
				return; 
			case FRUnivCoteAzurL3IAProjectHTMLPackage.FILTER:
				sequence_Filter(context, (Filter) semanticObject); 
				return; 
			case FRUnivCoteAzurL3IAProjectHTMLPackage.GRAPH:
				sequence_Graph(context, (Graph) semanticObject); 
				return; 
			case FRUnivCoteAzurL3IAProjectHTMLPackage.PROGRAM:
				sequence_Program(context, (Program) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     FileLoader returns FileLoader
	 *
	 * Constraint:
	 *     path=EString
	 */
	protected void sequence_FileLoader(ISerializationContext context, FileLoader semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FRUnivCoteAzurL3IAProjectHTMLPackage.Literals.FILE_LOADER__PATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FRUnivCoteAzurL3IAProjectHTMLPackage.Literals.FILE_LOADER__PATH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFileLoaderAccess().getPathEStringParserRuleCall_3_0(), semanticObject.getPath());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Filter returns Filter
	 *
	 * Constraint:
	 *     (columnname=EString abs?='abs'? comparaison=EnumComparaison? elementComparaison=EString?)
	 */
	protected void sequence_Filter(ISerializationContext context, Filter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Graph returns Graph
	 *
	 * Constraint:
	 *     (graphname=EString graphtype=EnumType)
	 */
	protected void sequence_Graph(ISerializationContext context, Graph semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FRUnivCoteAzurL3IAProjectHTMLPackage.Literals.GRAPH__GRAPHNAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FRUnivCoteAzurL3IAProjectHTMLPackage.Literals.GRAPH__GRAPHNAME));
			if (transientValues.isValueTransient(semanticObject, FRUnivCoteAzurL3IAProjectHTMLPackage.Literals.GRAPH__GRAPHTYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FRUnivCoteAzurL3IAProjectHTMLPackage.Literals.GRAPH__GRAPHTYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGraphAccess().getGraphnameEStringParserRuleCall_4_0(), semanticObject.getGraphname());
		feeder.accept(grammarAccess.getGraphAccess().getGraphtypeEnumTypeEnumRuleCall_7_0(), semanticObject.getGraphtype());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Program returns Program
	 *
	 * Constraint:
	 *     ((filter+=Filter filter+=Filter*)? fileloader+=FileLoader fileloader+=FileLoader* (graph+=Graph graph+=Graph*)?)
	 */
	protected void sequence_Program(ISerializationContext context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
