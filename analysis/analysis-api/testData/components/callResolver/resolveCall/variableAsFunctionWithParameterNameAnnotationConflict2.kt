// @ParameterName annotation takes precedence over name in function type parameter
fun call(x: (@ParameterName("first") @ParameterName("second") Int) -> Unit) {
    <expr>x(1)</expr>
}
