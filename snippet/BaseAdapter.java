
public class ListAdapter extends BaseAdapter {
	private Context mContext;
	private List<T> list;
	T t = null;
	ViewHolder holder = null;
	public ListAdapter(Context context, List<T> list) {
		mContext = context;
		this.list = list;
	}
	@Override
	public int getCount() {
		return list.size();
	}
	@Override
	public Report getItem(int position) {
		return list.get(position);
	}
	@Override
	public long getItemId(int position) {
		return list.get(position).getId();
	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		report = list.get(position);
		if (convertView == null) {
			holder = new ViewHolder();
			convertView = View.inflate(mContext, R.layout.item_list, null);
			holder.telTextView = (TextView) convertView.findViewById(R.id.tv);
			
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		holder.telTextView.setText(t.sth);

		return convertView;
	}
	private static class ViewHolder {
		TextView telTextView;

	}
}