package cat.vonblum.dodsoundboard.shared.domain.bus.command

interface CommandBus {

    fun dispatch(command: Command)

}