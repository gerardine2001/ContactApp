import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dispalycontactapp.Contact
import com.example.dispalycontactapp.R

class DispalyContactAdapter(var contactList: List<Contact>):RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var identity=LayoutInflater.from(parent.context).inflate(R.layout.contact_list_item,parent,false)
        return ContactViewHolder(identity)

    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact=contactList.get(position)
        holder.etName.text=currentContact.name
        holder.etName.text=currentContact.email
        holder.etPhone.text=currentContact.phone


    }

    override fun getItemCount(): Int {
        return contactList.size

    }
}
class ContactViewHolder(identity:View):RecyclerView.ViewHolder(identity){
    var etName=identity.findViewById<TextView>(R.id.etName)
    var etEmail=identity.findViewById<TextView>(R.id.etEmail)
    var etPhone=identity.findViewById<TextView>(R.id.etPhone)

}
