import sys
from antlr4 import ParserRuleContext

class ErrorHandling:
    RED = "\033[0;31m"
    GREEN = "\033[0;32m"
    YELLOW = "\033[0;33m"
    BLUE = "\033[0;34m"
    BOLD = "\033[1;38m"
    RESET = "\033[0m"

    prefix_msg = ["INFO", "WARNING", "ERROR"]
    prefix_format = [BLUE, YELLOW, RED]

    error_count = 0
    warning_count = 0
    log_file = sys.stdout  # default

    @staticmethod
    def new_line():
        ErrorHandling.log_file.write('\n')
        ErrorHandling.log_file.flush()

    @staticmethod
    def print_info(text):
        assert text is not None and len(text) > 0
        ErrorHandling.print_message(text, 1)

    @staticmethod
    def print_warning(text):
        assert text is not None and len(text) > 0
        ErrorHandling.warning_count += 1
        ErrorHandling.print_message(text, 2)

    @staticmethod
    def print_error(text):
        assert text is not None and len(text) > 0
        ErrorHandling.error_count += 1
        ErrorHandling.print_message(text, 3)

    @staticmethod
    def print_info_line(line, text):
        assert line > 0
        assert text is not None and len(text) > 0
        ErrorHandling.print_message_line(line, text, 1)

    @staticmethod
    def print_warning_line(line, text):
        assert line > 0
        assert text is not None and len(text) > 0
        ErrorHandling.warning_count += 1
        ErrorHandling.print_message_line(line, text, 2)

    @staticmethod
    def print_error_line(line, text):
        assert line > 0
        assert text is not None and len(text) > 0
        ErrorHandling.error_count += 1
        ErrorHandling.print_message_line(line, text, 3)

    @staticmethod
    def print_info_ctx(ctx, text):
        assert ctx is not None
        assert text is not None and len(text) > 0
        ErrorHandling.print_message_ctx(ctx, text, 1)

    @staticmethod
    def print_warning_ctx(ctx, text):
        assert ctx is not None
        assert text is not None and len(text) > 0
        ErrorHandling.warning_count += 1
        ErrorHandling.print_message_ctx(ctx, text, 2)

    @staticmethod
    def print_error_ctx(ctx, text):
        assert ctx is not None
        assert text is not None and len(text) > 0
        ErrorHandling.error_count += 1
        ErrorHandling.print_message_ctx(ctx, text, 3)

    @staticmethod
    def register_error():
        ErrorHandling.error_count += 1

    @staticmethod
    def error():
        return ErrorHandling.error_count > 0

    @staticmethod
    def get_error_count():
        return ErrorHandling.error_count

    @staticmethod
    def get_warning_count():
        return ErrorHandling.warning_count

    @staticmethod
    def redirect_log_file(log_file):
        assert log_file is not None
        ErrorHandling.log_file = log_file

    @staticmethod
    def reset():
        ErrorHandling.error_count = 0
        ErrorHandling.warning_count = 0

    @staticmethod
    def print_message(text, type):
        ErrorHandling.log_file.write(
            f"[{ErrorHandling.prefix_format[type - 1]}{ErrorHandling.prefix_msg[type - 1]}{ErrorHandling.RESET}] {text}\n"
        )
        ErrorHandling.log_file.flush()

    @staticmethod
    def print_message_line(line, text, type):
        ErrorHandling.log_file.write(
            f"[{ErrorHandling.prefix_format[type - 1]}{ErrorHandling.prefix_msg[type - 1]}{ErrorHandling.RESET} at line {line}] {text}\n"
        )
        ErrorHandling.log_file.flush()

    @staticmethod
    def print_message_ctx(ctx, text, type):
        ErrorHandling.print_message_line(ctx.start.line, text, type)
